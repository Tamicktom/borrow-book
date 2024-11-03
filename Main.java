
import src.Library;
import src.Menu;
import src.MenuOptions;

public class Main {
  private Library library = new Library();

  public static void main(String[] args) {
    System.out.println("Welcome to the library! Here are the books available:");

    Menu menu = new Menu();
    while (true) {
      MenuOptions option = menu.choose();
      switch (option) {
        case ADD_BOOK:
          break;
        case SEARCH_BOOK:
          break;
        case ADD_AUTHOR:
          break;
        case SEARCH_AUTHOR:
          break;
        case EXIT:
          break;
        default:
          break;
      }
    }
  }
}