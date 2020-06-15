package utilities.loggers.reports;

import utilities.loggers.enums.ReportLevel;

public interface Report {
    String getDateTime();
    ReportLevel getReportLevel();
    String getMessage();
}
