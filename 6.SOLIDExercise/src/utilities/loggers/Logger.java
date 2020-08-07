package utilities.loggers;

import utilities.loggers.appenders.Appender;
import utilities.loggers.reports.Report;

public interface Logger {
//    void logInfo(Report report);
//    void logWarning(Report report);
//    void logError(Report report);
//    void logCritical(Report report);
//    void logFatal(Report report);
    void addAppender(Appender appender);
    void log(Report report);
    String loggerInfo();
}
