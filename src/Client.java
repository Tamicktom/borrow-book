package src;

import java.util.List;

public class Client{
  private int id;
  public String name;
  private List<Borrow> borrows;

  public Client(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Client(int id, String name, List<Borrow> borrows) {
    this.id = id;
    this.name = name;
    this.borrows = borrows;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<Borrow> getBorrows() {
    return borrows;
  }

  public void addBorrow(Borrow borrow) {
    borrows.add(borrow);
  }
}
