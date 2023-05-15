package printerService;

public class Document implements PrinterService{

    @Override
    public void print() {
        System.out.println("Printing document");
    }
}
