package logger.appenders;

import logger.appenders.enums.ReportLevel;
import logger.layouts.Layout;

public abstract class AppenderImpl implements Appender {
    protected final Layout layout;
    private ReportLevel reportLevel;


    public AppenderImpl(Layout layout) {
        this.layout = layout;
        setReportLevel(ReportLevel.INFO);
    }

    public AppenderImpl(Layout layout, ReportLevel reportLevel) {
        this(layout);
        setReportLevel(reportLevel);
    }

    @Override
    public abstract void append(ReportLevel reportLevel, String time, String message);

    @Override
    public ReportLevel getReportLevel() {
        return reportLevel;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }
}
