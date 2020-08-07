package utilities.loggers.appenders.layouts;

import utilities.loggers.reports.Report;

public class TestLayout implements Layout {
    @Override
    public String format(Report report) {
        return "---------------------------------------------------------" + System.lineSeparator()
                + "REPORT LEVEL: " + report.getReportLevel() + System.lineSeparator()
                + "DATE: " + report.getDateTime() + System.lineSeparator()
                + "MESSAGE: " + report.getMessage();
    }
}
