package utilities.loggers.appenders.layouts;

import utilities.loggers.reports.Report;

public interface Layout {
    String format(Report report);
}
