package printerService;

public class Image implements PrinterService{
    @Override
    public void print() {
        System.out.println("Printing image");
    }
}
