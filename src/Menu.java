package src;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
  private Scanner scanner = new Scanner(System.in);

  public MenuOptions choose() {
    System.out.println("11. Add Book");
    System.out.println("12. List Book");
    System.out.println("13. Search Book");
    System.out.println("21. Add Client");
    System.out.println("22. List Client");
    System.out.println("23. Search Client");
    System.out.println("31. Add Author");
    System.out.println("32. List Author");
    System.out.println("33. Search Author");
    System.out.println("0. Exit");

    String choice = scanner.nextLine();

    switch (choice) {
      case "11":
        return MenuOptions.ADD_BOOK;
      case "12":
        return MenuOptions.LIST_BOOK;
      case "13":
        return MenuOptions.SEARCH_BOOK;
      case "21":
        return MenuOptions.ADD_CLIENT;
      case "22":
        return MenuOptions.LIST_CLIENT;
      case "23":
        return MenuOptions.SEARCH_CLIENT;
      case "31":
        return MenuOptions.ADD_AUTHOR;
      case "32":
        return MenuOptions.LIST_AUTHOR;
      case "33":
        return MenuOptions.SEARCH_AUTHOR;
      case "0":
        return MenuOptions.EXIT;
      default:
        return MenuOptions.EXIT;
    }
  }
}
