package src;

import java.util.List;

public class Borrow {
  private List<Book> booksBorrowed;
  private List<Book> booksReturned;

  public Borrow(List<Book> booksBorrowed, List<Book> booksReturned) {
    this.booksBorrowed = booksBorrowed;
    this.booksReturned = booksReturned;
  }
}
