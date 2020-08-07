package utilities.loggers.reports;

import utilities.loggers.enums.ReportLevel;
import utilities.loggers.helpers.Parser;

public class ReportImpl implements Report {
    private String dateTime;
    private ReportLevel reportLevel;
    private String message;

    public ReportImpl(String dateTime, ReportLevel reportLevel, String message) {
        this.dateTime = dateTime;
        this.reportLevel = reportLevel;
        this.message = message;
    }


    @Override
    public String getDateTime() {
        return this.dateTime;
    }

    @Override
    public ReportLevel getReportLevel() {
        return this.reportLevel;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
