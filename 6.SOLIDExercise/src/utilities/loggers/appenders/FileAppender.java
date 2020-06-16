package utilities.loggers.appenders;

import utilities.loggers.enums.ReportLevel;
import utilities.loggers.appenders.layouts.Layout;
import utilities.loggers.reports.Report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileAppender implements Appender {
    private Layout layout;
    private File file;
    private ReportLevel reportLevel;
    private long size;
    private int messagesAppended;

    public FileAppender(String path, Layout layout) {
        this.layout = layout;
        this.file = new File(path);
        this.reportLevel = ReportLevel.INFO;
        this.size = 0;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public ReportLevel getReportLevel() {
        return reportLevel;
    }

    @Override
    public void append(Report report) {
        try (BufferedWriter writer = Files.newBufferedWriter(
                file.toPath(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {

            String formattedMessage = layout.format(report);

            writer.write(formattedMessage);
            writer.newLine();

            this.addToSizeCount(this.sizeCounter(formattedMessage));
            messagesAppended++;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void addToSizeCount(long sizeCounter) {
        this.size += sizeCounter;
    }

    private long sizeCounter(String message) {
        long counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if (Character.isAlphabetic(message.charAt(i))) {
                counter += message.charAt(i);
            }
        }

        return counter;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s" +
                        ", Report level: %s, Messages appended: %d, File size: %d",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel,
                this.messagesAppended,
                this.size
        );
    }
}
