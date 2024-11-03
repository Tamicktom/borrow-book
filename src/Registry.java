package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Responsible for keeping track of all the books and authors in the library.
 * It saves the data in a .log file.
 */

public class Registry {
  private String filePath = "registry.log";
  private File file;
  private FileWriter writer;

  public Registry() {
    file = new File(filePath);

    try {
      writer = new FileWriter(file, true);
    } catch (IOException e) {
      System.out.println("Error creating file");
    }
  }

  public void newLog(String message) {
    try {
      writer.write(message);
      writer.close();
    } catch (IOException e) {
      System.out.println("Error writing to file");
    }
  }
}
