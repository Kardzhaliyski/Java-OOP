package figuresofstars;

import figuresofstars.figures.Figure;
import figuresofstars.figures.Rhombus;
import figuresofstars.figures.Square;
import figuresofstars.printers.ConsolePrinter;
import figuresofstars.printers.FilePrinter;
import figuresofstars.printers.Printer;


public class Main {
    public static void main(String[] args) {
        Figure figure = new Square(5);
        Figure figure2 = new Rhombus(5);
        Printer[] printers = new Printer[2];
        printers[0] = new FilePrinter();
        printers[1] = new ConsolePrinter();

        for (Printer printer : printers) {
            printer.print(figure.toString());
            printer.print(figure2.toString());
        }
    }
}
