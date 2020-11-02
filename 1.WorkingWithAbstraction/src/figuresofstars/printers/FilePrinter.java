package figuresofstars.printers;


import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilePrinter implements Printer {
    public FilePrinter(){}

    @Override
    public void print(String string) {
        try {
            Path path = Path.of("text.txt");
            if(!Files.exists(path)) {
                Files.createFile(path);
            }

            Files.write(path,
                    (string + System.lineSeparator()).getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
