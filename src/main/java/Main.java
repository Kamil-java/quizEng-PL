import AppiProvider.AppConnectionProvider;
import Printer.PrinterWords;

public class Main {
    public static void main(String[] args) {
        new PrinterWords().print(new AppConnectionProvider().getSessionFactory());
        new AppConnectionProvider().getSessionFactory().close();
    }
}
