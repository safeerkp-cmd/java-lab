// 3. Person -> Employee -> Teacher multi-level inheritance with array of objects

class Person {
  constructor(name, gender, address, age) {
    this.name = name;
    this.gender = gender;
    this.address = address;
    this.age = age;
  }
}

class Employee extends Person {
  constructor(name, gender, address, age, empid, companyName, qualification, salary) {
    super(name, gender, address, age);
    this.empid = empid;
    this.companyName = companyName;
    this.qualification = qualification;
    this.salary = salary;
  }
}

class Teacher extends Employee {
  constructor(
    name, gender, address, age,
    empid, companyName, qualification, salary,
    subject, department, teacherid
  ) {
    super(name, gender, address, age, empid, companyName, qualification, salary);
    this.subject = subject;
    this.department = department;
    this.teacherid = teacherid;
  }

  display() {
    console.log("-----------------------------");
    console.log(`Teacher ID   : ${this.teacherid}`);
    console.log(`Employee ID  : ${this.empid}`);
    console.log(`Name         : ${this.name}`);
    console.log(`Gender       : ${this.gender}`);
    console.log(`Age          : ${this.age}`);
    console.log(`Address      : ${this.address}`);
    console.log(`Company      : ${this.companyName}`);
    console.log(`Qualification: ${this.qualification}`);
    console.log(`Salary       : ${this.salary}`);
    console.log(`Department   : ${this.department}`);
    console.log(`Subject      : ${this.subject}`);
  }
}

const teachers = [
  new Teacher(
    "Alice", "Female", "123 Main St", 35,
    201, "ABC School", "M.Sc Physics", 70000,
    "Physics", "Science", "T001"
  ),
  new Teacher(
    "Bob", "Male", "456 Oak Ave", 40,
    202, "XYZ College", "M.A. English", 65000,
    "English", "Humanities", "T002"
  ),
  new Teacher(
    "Carol", "Female", "789 Pine Rd", 30,
    203, "PQR Institute", "M.Tech CS", 80000,
    "Computer Science", "Technology", "T003"
  ),
];

console.log(`\nDetails of ${teachers.length} Teachers:`);
teachers.forEach((t) => t.display());
