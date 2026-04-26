// 4. Publisher -> Book -> Literature / Fiction inheritance

class Publisher {
  constructor(publisherName, publishYear) {
    this.publisherName = publisherName;
    this.publishYear = publishYear;
  }
}

class Book extends Publisher {
  constructor(title, author, price, publisherName, publishYear) {
    super(publisherName, publishYear);
    this.title = title;
    this.author = author;
    this.price = price;
  }

  display() {
    console.log(`Title         : ${this.title}`);
    console.log(`Author        : ${this.author}`);
    console.log(`Price         : $${this.price}`);
    console.log(`Publisher     : ${this.publisherName}`);
    console.log(`Published Year: ${this.publishYear}`);
  }
}

class Literature extends Book {
  constructor(title, author, price, publisherName, publishYear, literaryPeriod) {
    super(title, author, price, publisherName, publishYear);
    this.literaryPeriod = literaryPeriod;
  }

  display() {
    console.log("--- Literature Book ---");
    super.display();
    console.log(`Literary Period: ${this.literaryPeriod}`);
  }
}

class Fiction extends Book {
  constructor(title, author, price, publisherName, publishYear, subGenre) {
    super(title, author, price, publisherName, publishYear);
    this.subGenre = subGenre;
  }

  display() {
    console.log("--- Fiction Book ---");
    super.display();
    console.log(`Sub-Genre     : ${this.subGenre}`);
  }
}

const books = [
  new Literature("Pride and Prejudice", "Jane Austen", 12.99, "Penguin Classics", 1813, "Romanticism"),
  new Fiction("1984", "George Orwell", 9.99, "Secker & Warburg", 1949, "Dystopian"),
  new Literature("Hamlet", "William Shakespeare", 8.49, "Oxford University Press", 1603, "Renaissance"),
  new Fiction("The Hobbit", "J.R.R. Tolkien", 14.99, "Allen & Unwin", 1937, "Fantasy"),
];

console.log("\nBook Details:\n");
books.forEach((book) => {
  book.display();
  console.log();
});
