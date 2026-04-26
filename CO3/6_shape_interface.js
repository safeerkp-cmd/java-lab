// 6. Interface (via abstract-like class) with Circle and Rectangle - menu-driven

const readline = require("readline");

// Simulated interface using a base class with unimplemented methods
class Shape {
  area() {
    throw new Error("area() must be implemented");
  }

  perimeter() {
    throw new Error("perimeter() must be implemented");
  }
}

class Circle extends Shape {
  constructor(radius) {
    super();
    this.radius = radius;
  }

  area() {
    return Math.PI * this.radius * this.radius;
  }

  perimeter() {
    return 2 * Math.PI * this.radius;
  }
}

class Rectangle extends Shape {
  constructor(length, width) {
    super();
    this.length = length;
    this.width = width;
  }

  area() {
    return this.length * this.width;
  }

  perimeter() {
    return 2 * (this.length + this.width);
  }
}

function printMenu() {
  console.log("\n===== Shape Calculator =====");
  console.log("1. Circle");
  console.log("2. Rectangle");
  console.log("3. Exit");
  console.log("============================");
  process.stdout.write("Choose shape (1/2/3): ");
}

function printShapeMenu() {
  console.log("\n  1. Area");
  console.log("  2. Perimeter");
  console.log("  3. Both");
  process.stdout.write("Choose operation (1/2/3): ");
}

const rl = readline.createInterface({ input: process.stdin, output: process.stdout });

function askShape() {
  printMenu();
  rl.once("line", (choice) => {
    choice = choice.trim();

    if (choice === "3") {
      console.log("Goodbye!");
      rl.close();
      return;
    }

    if (choice === "1") {
      process.stdout.write("Enter radius: ");
      rl.once("line", (r) => {
        const radius = parseFloat(r);
        const shape = new Circle(radius);
        printShapeMenu();
        rl.once("line", (op) => handleOp(op.trim(), shape, askShape));
      });
    } else if (choice === "2") {
      process.stdout.write("Enter length: ");
      rl.once("line", (l) => {
        process.stdout.write("Enter width: ");
        rl.once("line", (w) => {
          const shape = new Rectangle(parseFloat(l), parseFloat(w));
          printShapeMenu();
          rl.once("line", (op) => handleOp(op.trim(), shape, askShape));
        });
      });
    } else {
      console.log("Invalid choice, try again.");
      askShape();
    }
  });
}

function handleOp(op, shape, next) {
  if (op === "1") {
    console.log(`Area      : ${shape.area().toFixed(2)}`);
  } else if (op === "2") {
    console.log(`Perimeter : ${shape.perimeter().toFixed(2)}`);
  } else if (op === "3") {
    console.log(`Area      : ${shape.area().toFixed(2)}`);
    console.log(`Perimeter : ${shape.perimeter().toFixed(2)}`);
  } else {
    console.log("Invalid operation.");
  }
  next();
}

askShape();
