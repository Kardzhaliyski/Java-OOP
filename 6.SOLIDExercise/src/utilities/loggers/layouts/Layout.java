package utilities.loggers.layouts;

import utilities.loggers.reports.Report;

public interface Layout {
    String format(Report report);
}
