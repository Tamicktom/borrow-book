package src;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;
  private List<Author> authors;
  private List<Client> clients;

  public Library() {
    books = new ArrayList<Book>();
    authors = new ArrayList<Author>();
    clients = new ArrayList<Client>();
  }

  public List<Book> getBooks() {
    return books;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void addAuthor(Author author) {
    authors.add(author);
  }

  public List<Book> searchBooks(String title) {
    List<Book> booksFound = new ArrayList<Book>();
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        booksFound.add(book);
      }
    }
    return booksFound;
  }
}
