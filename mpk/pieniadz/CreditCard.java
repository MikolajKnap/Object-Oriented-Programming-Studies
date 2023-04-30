package mpk.pieniadz;

public class CreditCard extends Money {
    private double availableFunds;
    public CreditCard(double funds){
        value = 1.00;
        this.availableFunds = funds;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void buyWithCard(double price) {
        this.availableFunds -= price;
    }
}
