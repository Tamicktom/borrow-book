package src;

import java.util.Date;

public class Book {
  private int id;
  private String title;
  private boolean borrowed = false;
  private Author author;

  private Date dateAdded = new Date();
  private Date dateUpdated = new Date();

  public Book(int id, String title, Author author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isBorrowed() {
    return borrowed;
  }

  public Author getAuthor() {
    return author;
  }

  public Date getDateAdded() {
    return dateAdded;
  }

  public Date getDateUpdated() {
    return dateUpdated;
  }
}
