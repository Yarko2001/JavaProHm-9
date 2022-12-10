package dehtiar.ua.model;

import java.io.Serializable;

/**
 * @author Yaroslav Dehtiar on 04.12.2022
 */
public class FileLoggerConfiguration extends LoggerConfiguration implements Serializable {

  private final String destinationFile;
  private final int maxSizeFile;
  private final String format;

  public FileLoggerConfiguration(String destinationFile, LoggingLevel currentLoggingLevel,
      int maxSizeFile, String fileFormat) {

    this.destinationFile = destinationFile;
    super.currentLoggingLevel = currentLoggingLevel;
    this.maxSizeFile = maxSizeFile;
    this.format = fileFormat;
  }

  public String getDestinationFile() {
    return destinationFile;
  }

  public LoggingLevel getCurrentLoggingLevel() {
    return currentLoggingLevel;
  }

  public int getMaxSizeFile() {
    return maxSizeFile;
  }

  public String getFormat() {
    return format;
  }
}
