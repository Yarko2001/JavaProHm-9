package dehtiar.ua.api;

import dehtiar.ua.exceptions.FileMaxSizeReachedException;
import java.io.IOException;

/**
 * @author Yaroslav Dehtiar on 04.12.2022
 */
public interface Logable {

  public void debug(String message) throws FileMaxSizeReachedException, IOException;

  public void info(String message) throws FileMaxSizeReachedException, IOException;
}
