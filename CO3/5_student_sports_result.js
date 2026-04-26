// 5. Student + Sports -> Result (multiple inheritance via mixins)

class Student {
  constructor(name, rollNo, academicScore) {
    this.name = name;
    this.rollNo = rollNo;
    this.academicScore = academicScore;
  }

  getAcademicInfo() {
    return `Name: ${this.name} | Roll No: ${this.rollNo} | Academic Score: ${this.academicScore}`;
  }
}

class Sports {
  constructor(sport, sportsScore) {
    this.sport = sport;
    this.sportsScore = sportsScore;
  }

  getSportsInfo() {
    return `Sport: ${this.sport} | Sports Score: ${this.sportsScore}`;
  }
}

// Mixin to combine Sports into a class
function applySportsMixin(Base) {
  return class extends Base {
    setSports(sport, sportsScore) {
      this.sport = sport;
      this.sportsScore = sportsScore;
    }

    getSportsInfo() {
      return `Sport: ${this.sport} | Sports Score: ${this.sportsScore}`;
    }
  };
}

class Result extends applySportsMixin(Student) {
  constructor(name, rollNo, academicScore, sport, sportsScore) {
    super(name, rollNo, academicScore);
    this.setSports(sport, sportsScore);
  }

  get totalScore() {
    return this.academicScore + this.sportsScore;
  }

  display() {
    console.log("-----------------------------");
    console.log(this.getAcademicInfo());
    console.log(this.getSportsInfo());
    console.log(`Total Score  : ${this.totalScore}`);
  }
}

const students = [
  new Result("Alice", 1, 85, "Cricket", 90),
  new Result("Bob", 2, 78, "Football", 82),
  new Result("Carol", 3, 92, "Basketball", 88),
];

console.log("\nStudent Results:\n");
students.forEach((s) => s.display());
