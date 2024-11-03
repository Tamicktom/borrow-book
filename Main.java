import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import src.Author;
import src.Library;
import src.Menu;
import src.MenuOptions;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    System.out.println("Welcome to the library! Here are the books available:");

    Menu menu = new Menu();

    boolean running = true;

    while (running) {
      MenuOptions option = menu.choose();
      switch (option) {
        case ADD_BOOK:
          break;
        case LIST_BOOK:
          break;
        case SEARCH_BOOK:
          break;
        case ADD_CLIENT:
          break;
        case LIST_CLIENT:
          break;
        case SEARCH_CLIENT:
          break;
        case ADD_AUTHOR:
          System.out.println("Enter the author's name: ");
          String name = scanner.nextLine();
          System.out.println("Enter the author's birth date (YYYY-MM-DD): ");
          String birthDate = scanner.nextLine();
          LocalDate date = LocalDate.parse(birthDate);

          // grab last author in the list
          int id = 0;
          Author lastAuthor = library.getLastAuthor();
          if (lastAuthor != null) {
            id = lastAuthor.getId() + 1;
          } else {
            id = 1;
          }

          Author author = new Author(id, name, date);
          library.addAuthor(author);
          break;
        case LIST_AUTHOR:
          System.out.println("Here are the authors in the library:");
          List<Author> authors = library.getAuthors();
          for (Author a : authors) {
            System.out.println(a.getName());
          }
          break;
        case SEARCH_AUTHOR:
          break;
        case EXIT:
          running = false;
          break;
        default:
          break;
      }
    }

    scanner.close();
  }
}