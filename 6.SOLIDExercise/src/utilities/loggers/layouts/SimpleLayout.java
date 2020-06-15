package utilities.loggers.layouts;

import utilities.loggers.reports.Report;

public class SimpleLayout implements Layout {

    @Override
    public String format(Report report) {
        return String.format("%s - %s - %s",
                report.getDateTime(),
                report.getReportLevel(),
                report.getMessage());
    }
}
