package logger.layouts;

import logger.appenders.enums.ReportLevel;

public class SimpleLayout implements Layout {

    @Override
    public String format(ReportLevel reportLevel , String time, String message) {
        return String.format("%s - %s - %s", reportLevel.toString(), time, message);
    }
}
