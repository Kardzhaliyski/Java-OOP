package utilities.loggers.appenders;

import utilities.loggers.enums.ReportLevel;
import utilities.loggers.layouts.Layout;
import utilities.loggers.reports.Report;

public class ConsoleAppender implements Appender {
    private Layout layout;
    private ReportLevel reportLevel;
    private int messagesAppended;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
        this.reportLevel = ReportLevel.INFO;
    }

    @Override
    public void append(Report report) {
        messagesAppended++;
        System.out.println(layout.format(report));
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public ReportLevel getReportLevel() {
        return reportLevel;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s" +
                        ", Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel,
                this.messagesAppended
                );
    }
}
