import utilities.loggers.*;
import utilities.loggers.appenders.*;
import utilities.loggers.appenders.layouts.*;
import utilities.loggers.helpers.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            Logger logger = new MessageLogger();

            int numberOfAppenders = Integer.parseInt(bfr.readLine());
            for (int i = 0; i < numberOfAppenders; i++) {
                var tokens =  bfr.readLine().split("\\s+");

                var layoutType = tokens[1];
                Layout layout = Parser.newLayout(layoutType);

                var appenderType = tokens[0];

                Appender appender;
                if(tokens.length == 4) {
                    String filePath = tokens[3];
                    appender = Parser.newAppender(appenderType, layout,filePath);
                } else {
                    appender = Parser.newAppender(appenderType, layout);
                }

                if(tokens.length >= 3) {
                    appender.setReportLevel(ReportLevel.valueOf(tokens[2].toUpperCase()));
                }

                logger.addAppender(appender);
            }

            var input = bfr.readLine();
            while (!input.equals("END")) {

                logger.log(Parser.reportParser(input));

                input = bfr.readLine();
            }

            System.out.println(logger.loggerInfo());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
