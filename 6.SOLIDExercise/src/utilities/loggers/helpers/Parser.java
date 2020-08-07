package utilities.loggers.helpers;

import utilities.loggers.appenders.*;
import utilities.loggers.enums.*;
import utilities.loggers.appenders.layouts.*;
import utilities.loggers.reports.*;

public class Parser {

    private Parser(){}

    public static Report reportParser(String input) {
        var tokens = input.split("\\|");

        var dateTime = tokens[1];
        var reportLevel = ReportLevel.valueOf(tokens[0].toUpperCase());
        var message = tokens[2];
        return new ReportImpl(dateTime, reportLevel, message);
    }

    public static Layout newLayout(String layoutType) {
        if(LayoutTypes.SIMPLE.getName().equals(layoutType)) {
            return new SimpleLayout();
        } else if (LayoutTypes.XML.getName().equals(layoutType)) {
            return new XmlLayout();
        } else if (LayoutTypes.TEST.getName().equals(layoutType)) {
            return new TestLayout();
        }
        else {
            throw new IllegalArgumentException(
                    "Layout does not exist with name: " + layoutType);
        }
    }

    public static Appender newAppender(String appenderType, Layout layout) {
        if(AppenderType.FILE.getName().equals(appenderType)){
            return new FileAppender("text.txt", layout);
        } else if(AppenderType.CONSOLE.getName().equals(appenderType)) {
            return new ConsoleAppender(layout);
        } else {
            throw new IllegalArgumentException(
                    "Appender does not exist of type: " + appenderType);
        }
    }

    public static Appender newAppender(String appenderType, Layout layout, String optional) {
        if(AppenderType.FILE.getName().equals(appenderType)){
            return new FileAppender(optional, layout);
        } else if(AppenderType.CONSOLE.getName().equals(appenderType)) {
            return new ConsoleAppender(layout);
        } else {
            throw new IllegalArgumentException(
                    "Appender does not exist of type: " + appenderType);
        }
    }
}
