package utilities.loggers.layouts;

import utilities.loggers.reports.Report;

public class XmlLayout implements Layout {
    @Override
    public String format(Report report) {
        StringBuilder builder = new StringBuilder();

        builder.append("<log>").append(System.lineSeparator())
                .append("   <date>").append(report.getDateTime()).append("</date>")
                .append(System.lineSeparator())
                .append("   <level>").append(report.getReportLevel()).append("</level>")
                .append(System.lineSeparator())
                .append("   <message>").append(report.getMessage()).append("</message>")
                .append(System.lineSeparator())
                .append("</log>");

        return builder.toString();
    }
}
