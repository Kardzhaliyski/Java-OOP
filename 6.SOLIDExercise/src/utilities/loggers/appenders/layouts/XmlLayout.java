package utilities.loggers.appenders.layouts;

import utilities.loggers.reports.Report;

public class XmlLayout implements Layout {
    @Override
    public String format(Report report) {

        return String.format("<log>%n" +
                        "   <date>%s</date>%n" +
                        "   <level>%s</level>%n" +
                        "   <message>%s</message>%n" +
                        "</log>",
                report.getDateTime(),
                report.getReportLevel(),
                report.getMessage());
    }
}
