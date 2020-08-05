import logger.loggers.Logger;
import logger.loggers.MessageLogger;
import logger.appenders.Appender;
import logger.appenders.ConsoleAppender;
import logger.appenders.enums.ReportLevel;
import logger.layouts.Layout;
import logger.layouts.SimpleLayout;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender appender = new ConsoleAppender(simpleLayout);
        Appender appender2 = new ConsoleAppender(simpleLayout, ReportLevel.valueOf("FATAL"));
        Logger logger = new MessageLogger(appender, appender2);
        logger.logFatal("05-10-2020", "CRITICAL ERROR !!!");
    }
}
