// 1. Area of different shapes using overloaded functions

function area(shape, ...args) {
  switch (shape.toLowerCase()) {
    case "circle": {
      const [radius] = args;
      return Math.PI * radius * radius;
    }
    case "rectangle": {
      const [length, width] = args;
      return length * width;
    }
    case "triangle": {
      const [base, height] = args;
      return 0.5 * base * height;
    }
    case "square": {
      const [side] = args;
      return side * side;
    }
    default:
      throw new Error(`Unknown shape: ${shape}`);
  }
}

console.log("Area of Circle (radius=7):", area("circle", 7).toFixed(2));
console.log("Area of Rectangle (5x10):", area("rectangle", 5, 10));
console.log("Area of Triangle (base=6, height=8):", area("triangle", 6, 8));
console.log("Area of Square (side=4):", area("square", 4));
