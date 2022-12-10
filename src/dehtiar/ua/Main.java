package dehtiar.ua;

import dehtiar.ua.exceptions.FileMaxSizeReachedException;
import dehtiar.ua.model.FileLogger;
import dehtiar.ua.model.FileLoggerConfigurationLoader;
import java.io.IOException;

/**
 * @author Yaroslav Dehtiar on 04.12.2022
 */
public class Main {

  public static void main(String[] args) {
    FileLoggerConfigurationLoader flcl = new FileLoggerConfigurationLoader();
    FileLogger fl = new FileLogger(
        flcl.load("src\\dehtiar\\ua\\resources\\my_custom_configuration.properties"));

    try {
      fl.info("Hello.Testing text was written from info.");
      fl.debug("Hello.Testing text was written from debug.");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (FileMaxSizeReachedException e) {
      throw new RuntimeException(e);
    }
  }

}
