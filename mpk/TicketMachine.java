package mpk;

import mpk.pieniadz.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class TicketMachine {

    Ticket[] rodzajeBiletow;
    String lokalizacja;
    ArrayList<Transcation> transkacje = new ArrayList<>();
    Money[] availableBankNotes;
    public TicketMachine(String lokalizacja){
        this.rodzajeBiletow = Ticket.values();
        this.lokalizacja = lokalizacja;
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
        for (Ticket rodzaj:rodzajeBiletow) {
            System.out.println(rodzaj);
        }
    }
    public void buyTicket(Ticket typBiletu, int iloscBiletow, LocalDate data, ArrayList<Money> formaPlatnosci){
        double price = typBiletu.price * iloscBiletow;
        double payment = 0;
        for(Money banknote : formaPlatnosci){
            payment += banknote.getValue();
        }
        if(payment < price){
            System.out.println("Not enough cash");
            return;
        }
        else{
            transkacje.add(new Transcation(data,typBiletu,iloscBiletow,price));
            giveChange(price, payment);
        }
    }

    public void buyTicket(Ticket typBiletu, int iloscBiletow, LocalDate data, CreditCard card){
        double price = typBiletu.price * iloscBiletow;
        if(card.getAvailableFunds() < price){
            System.out.println("Not enough cash");
            return;
        }
        else{
            card.buyWithCard(price);
            transkacje.add(new Transcation(data,typBiletu,iloscBiletow,price));
        }
    }

    private void giveChange(double price, double payment){
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
    }
    public void wydrukujTransakcje(LocalDate data){
        for (Transcation transcation :transkacje) {
            if(transcation.getData().isEqual(data))
                System.out.println(transcation);
        }
    }
}
