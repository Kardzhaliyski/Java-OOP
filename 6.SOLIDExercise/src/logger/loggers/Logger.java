package logger.loggers;

import logger.appenders.Appender;
import logger.appenders.enums.ReportLevel;

public interface Logger {
    void addAppender(Appender appender);

    void logInfo(String time, String message);
    void logWarning(String time, String message);
    void logError(String time, String message);
    void logCritical(String time, String message);
    void logFatal(String time, String message);

}
