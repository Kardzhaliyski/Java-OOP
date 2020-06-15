package utilities.loggers.appenders;

import utilities.loggers.enums.ReportLevel;
import utilities.loggers.reports.Report;

public interface Appender {
    void append(Report report);
    void setReportLevel(ReportLevel reportLevel);
    ReportLevel getReportLevel();
}


