package logger.appenders;

import logger.appenders.enums.ReportLevel;

public interface Appender {
    void append(ReportLevel reportLevel, String time, String message);
    ReportLevel getReportLevel();
    void setReportLevel(ReportLevel reportLevel);
}
