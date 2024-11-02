package src;

import java.util.Date;

public class Author {
  private int id;
  public String name;

  private Date birthDate;
  private Date deathDate = null;

  public Author(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Author(int id, String name, Date birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  public Author(int id, String name, Date birthDate, Date deathDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
    this.deathDate = deathDate;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public Date getDeathDate() {
    return deathDate;
  }
}
