package src;

import java.time.LocalDate;

public class Author {
  private int id;
  public String name;

  private LocalDate birthDate;
  private LocalDate deathDate = null;

  public Author(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Author(int id, String name, LocalDate birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  public Author(int id, String name, LocalDate birthDate, LocalDate deathDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
    this.deathDate = deathDate;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public LocalDate getDeathDate() {
    return deathDate;
  }
}
