package dehtiar.ua.exceptions;

/**
 * @author Yaroslav Dehtiar on 04.12.2022
 */
public class FileMaxSizeReachedException extends Exception {

  public FileMaxSizeReachedException(String message) {
    super(message);
  }
}
