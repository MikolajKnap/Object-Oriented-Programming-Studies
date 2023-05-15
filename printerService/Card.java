package printerService;

public class Card implements PrinterService {
    @Override
    public void print() {
        System.out.println("Printing card");
    }
}
