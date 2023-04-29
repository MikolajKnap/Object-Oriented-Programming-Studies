package mpk;

import mpk.pieniadz.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biletomat {

    Bilet.Rodzaj[] rodzajeBiletow;
    String lokalizacja;
    ArrayList<Transakcja> transkacje = new ArrayList<>();
    Pieniadz[] availableBankNotes;
    public Biletomat(String lokalizacja){
        this.rodzajeBiletow = Bilet.Rodzaj.values();
        this.lokalizacja = lokalizacja;
        this.availableBankNotes = new Pieniadz[] {
                new PiecsetZloty(),
                new DwiescieZloty(),
                new StoZloty(),
                new PiecdziesiatZloty(),
                new DwadziesciaZloty(),
                new DziesiecZloty(),
                new DwaZloty(),
                new JedenZloty()
        };
    }
    public void dostepneBilety(){
        System.out.println("Dostepne bilety:");
        for (Bilet.Rodzaj rodzaj:rodzajeBiletow) {
            System.out.println(rodzaj);
        }
    }
    public void kupBilet(Bilet.Rodzaj typBiletu, int iloscBiletow, LocalDate data, ArrayList<Pieniadz> formaPlatnosci){
        double price = typBiletu.cena * iloscBiletow;
        double payment = 0;
        for(Pieniadz banknote : formaPlatnosci){
            payment += banknote.wartosc;
        }
        if(payment < price){
            System.out.println("Zbyt mala wplata");
            return;
        }
        else{
            transkacje.add(new Transakcja(data,typBiletu,iloscBiletow,price));
            giveChange(price, payment);
        }
    }
    private void giveChange(double price, double payment){
        ArrayList<Pieniadz> change = new ArrayList<>();
        double toChange = payment - price;

        for (Pieniadz bankNote : availableBankNotes) {
            while (toChange >= bankNote.wartosc) {
                change.add(bankNote);
                toChange -= bankNote.wartosc;
            }
        }

        System.out.println("Your change: ");
        for (Pieniadz bankNote : change){
            System.out.println(bankNote);
        }
    }
    public void wydrukujTransakcje(LocalDate data){
        for (Transakcja transakcja:transkacje) {
            if(transakcja.getData().isEqual(data)){
                System.out.println(transakcja);
            }
        }
    }
}
