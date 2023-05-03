package mpk;
public enum Ticket {
    Reduced(20.00, "Ulgowy"),
    Regular(30.00,"Normalny");
    final double price;
    final String name;
    Ticket(double price, String ticketName){
        this.price = price;
        this.name = ticketName;
    }
    @Override
    public String toString() {
        return name + " : " + price;
    }
}

