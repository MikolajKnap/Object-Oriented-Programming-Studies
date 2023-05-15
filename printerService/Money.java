package printerService;

public class Money implements PrinterService{
    @Override
    public void print() {
        System.out.println("Printing money");
    }
}
