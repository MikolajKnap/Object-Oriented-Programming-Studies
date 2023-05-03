package mpk;

import mpk.pieniadz.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class TicketMachine {

    // Kompozycja z klasa Ticket
    Ticket[] ticketTypes;

    // Kompozycja z klasa Transaction
    ArrayList<Transcation> transcations = new ArrayList<>();

    // Kompozycja z klasa Money
    Money[] availableBankNotes;

    String localization;
    public TicketMachine(String localization){
        this.ticketTypes = Ticket.values();
        this.localization = localization;
        this.availableBankNotes = new Money[] {
                new FiveHundredZloty(),
                new TwoHundredZloty(),
                new OneHundredZloty(),
                new FiftyZloty(),
                new TwentyZloty(),
                new TenZloty(),
                new TwoZloty(),
                new OneZloty()
        };
    }
    public void dostepneBilety(){
        System.out.println("Dostepne bilety:");
        for (Ticket rodzaj: ticketTypes) {
            System.out.println(rodzaj);
        }
    }
    public ArrayList<Money> buyTicket(Ticket ticketType, int numberofTickets, LocalDate data, ArrayList<Money> wallet){
        double price = ticketType.price * numberofTickets;
        double payment = 0;
        for(Money banknote : wallet){
            payment += banknote.getValue();
        }
        if(payment < price){
            System.out.println("Not enough cash");
            return wallet;
        }
        else{
            System.out.println("You bought: " + ticketType + " : " + numberofTickets);
            ArrayList<Money> change = giveChange(price, payment);
            transcations.add(new Transcation(data,ticketType,numberofTickets,price));
            return change;
        }
    }

    public void buyTicket(Ticket ticketType, int numberOfTickets, LocalDate data, CreditCard card){
        double price = ticketType.price * numberOfTickets;
        if(card.getAvailableFunds() < price){
            System.out.println("Not enough funds");
            return;
        }
        else{
            System.out.println("You bought: " + ticketType + " : " + numberOfTickets);
            card.buyWithCard(price);
            transcations.add(new Transcation(data,ticketType,numberOfTickets,price));
        }
    }

    private ArrayList<Money> giveChange(double price, double payment){
        ArrayList<Money> change = new ArrayList<>();
        double toChange = payment - price;

        for (Money bankNote : availableBankNotes) {
            while (toChange >= bankNote.getValue()) {
                change.add(bankNote);
                toChange -= bankNote.getValue();
            }
        }

        System.out.println("Your change: ");
        for (Money bankNote : change){
            System.out.println(bankNote);
        }
        return change;
    }
    public void printTransaction(LocalDate data){
        for (Transcation transcation : transcations) {
            if(transcation.getData().isEqual(data))
                System.out.println(transcation);
        }
    }

    public void printTransaction(){
        for (Transcation transcation : transcations) {
                System.out.println(transcation);
        }
    }
}
