package logger.loggers;

import logger.appenders.Appender;
import logger.appenders.enums.ReportLevel;

import java.util.*;

public class MessageLogger implements Logger {

    private Set<Appender> appenders;

    public MessageLogger(Appender... appenders) {
        setAppenders(appenders);

    }

    private void setAppenders(Appender[] appenders) {
        this.appenders = new HashSet<>();
        Collections.addAll(this.appenders, appenders);
    }

    @Override
    public void addAppender(Appender appender) {
        this.appenders.add(appender);
    }

    private void log(ReportLevel reportLevel, String time, String message) {
        for (Appender appender : appenders) {
            if(appender.getReportLevel().ordinal() <= reportLevel.ordinal()){
                appender.append(reportLevel, time, message);
            }
        }
    }


    @Override
    public void logInfo(String time, String message) {
        this.log(ReportLevel.INFO, time, message);
    }

    @Override
    public void logWarning(String time, String message) {
        this.log(ReportLevel.WARNING, time, message);
    }

    @Override
    public void logError(String time, String message) {
        this.log(ReportLevel.ERROR, time, message);
    }

    @Override
    public void logCritical(String time, String message) {
        this.log(ReportLevel.CRITICAL, time, message);
    }

    @Override
    public void logFatal(String time, String message) {
        this.log(ReportLevel.FATAL, time, message);
    }
}
