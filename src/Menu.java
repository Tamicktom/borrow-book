package src;

import java.util.Scanner;

public class Menu {
  private Scanner scanner = new Scanner(System.in);

  public MenuOptions choose() {
    System.out.println("1. Add Book");
    System.out.println("2. Search Book");
    System.out.println("3. Add Client");
    System.out.println("4. Search Client");
    System.out.println("5. Add Author");
    System.out.println("6. Search Author");
    System.out.println("7. Exit");

    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        return MenuOptions.ADD_BOOK;
      case 2:
        return MenuOptions.SEARCH_BOOK;
      case 3:
        return MenuOptions.ADD_CLIENT;
      case 4:
        return MenuOptions.SEARCH_CLIENT;
      case 5:
        return MenuOptions.ADD_AUTHOR;
      case 6:
        return MenuOptions.SEARCH_AUTHOR;
      case 7:
        return MenuOptions.EXIT;
      default:
        return MenuOptions.EXIT;
    }
  }
}
