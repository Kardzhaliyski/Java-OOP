package utilities.loggers;

import utilities.loggers.appenders.Appender;
import utilities.loggers.reports.Report;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageLogger implements Logger {
    private List<Appender> appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = new ArrayList<>();

        this.appenders.addAll(Arrays.asList(appenders));
    }

    @Override
    public void addAppender(Appender appender) {
        if(appender != null){
            this.appenders.add(appender);
        }
    }

    public void log(Report report) {
        for (Appender appender : appenders) {
            if(appender.getReportLevel().ordinal() <= report.getReportLevel().ordinal()) {
                appender.append(report);
            }
        }
    }

    @Override
    public String loggerInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Logger info");
        for (Appender appender : appenders) {
            builder.append(System.lineSeparator());
            builder.append(appender.toString());
        }

        return builder.toString();
    }
}
