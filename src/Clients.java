package src;

import java.util.List;

public class Clients {
  private int id;
  public String name;
  private List<Borrow> borrows;

  public Clients(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
