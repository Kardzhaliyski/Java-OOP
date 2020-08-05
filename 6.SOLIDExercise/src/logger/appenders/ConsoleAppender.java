package logger.appenders;

import logger.appenders.enums.ReportLevel;
import logger.layouts.Layout;

public class ConsoleAppender extends AppenderImpl {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    public ConsoleAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    @Override
    public void append(ReportLevel reportLevel, String time, String message) {
        System.out.println(layout.format(reportLevel, time, message));

    }

}
