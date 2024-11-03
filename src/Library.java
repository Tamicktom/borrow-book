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

  public Author getAuthor(int id) {
    for (Author author : authors) {
      if (author.getId() == id) {
        return author;
      }
    }
    return null;
  }

  public Author getLastAuthor() {
    if (authors.size() == 0) {
      return null;
    }
    return authors.get(authors.size() - 1);
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void addAuthor(Author author) {
    authors.add(author);
  }

  public void addClient(Client client) {
    clients.add(client);
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

  public List<Author> searchAuthors(String name) {
    List<Author> authorsFound = new ArrayList<Author>();
    for (Author author : authors) {
      if (author.getName().equals(name)) {
        authorsFound.add(author);
      }
    }
    return authorsFound;
  }

  public List<Client> searchClients(String name) {
    List<Client> clientsFound = new ArrayList<Client>();
    for (Client client : clients) {
      if (client.getName().equals(name)) {
        clientsFound.add(client);
      }
    }
    return clientsFound;
  }
}
