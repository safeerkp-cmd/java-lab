// 2. Employee -> Teacher inheritance with array of objects

class Employee {
  constructor(empid, name, salary, address) {
    this.empid = empid;
    this.name = name;
    this.salary = salary;
    this.address = address;
  }
}

class Teacher extends Employee {
  constructor(empid, name, salary, address, department, subjectsTaught) {
    super(empid, name, salary, address);
    this.department = department;
    this.subjectsTaught = subjectsTaught;
  }

  display() {
    console.log("-----------------------------");
    console.log(`Employee ID  : ${this.empid}`);
    console.log(`Name         : ${this.name}`);
    console.log(`Salary       : ${this.salary}`);
    console.log(`Address      : ${this.address}`);
    console.log(`Department   : ${this.department}`);
    console.log(`Subjects     : ${this.subjectsTaught.join(", ")}`);
  }
}

const teachers = [
  new Teacher(101, "Alice", 60000, "123 Main St", "Science", ["Physics", "Chemistry"]),
  new Teacher(102, "Bob", 55000, "456 Oak Ave", "Mathematics", ["Algebra", "Calculus"]),
  new Teacher(103, "Carol", 65000, "789 Pine Rd", "English", ["Literature", "Grammar"]),
];

console.log(`\nDetails of ${teachers.length} Teachers:`);
teachers.forEach((t) => t.display());
