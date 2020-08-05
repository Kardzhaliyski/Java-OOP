package logger.layouts;

import logger.appenders.enums.ReportLevel;

public interface Layout {
    String format(ReportLevel reportLevel, String time, String message);
}
