package src;

import java.util.Date;

public class Book {
  int id;
  String title;
  boolean borrowed = false;
  Author author;

  Date dateAdded = new Date();
  Date dateUpdated = new Date();

  public Book(int id, String title, Author author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }
}
