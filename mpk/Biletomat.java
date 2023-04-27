package mpk;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biletomat {

    Bilet.Rodzaj[] rodzajeBiletow;
    String lokalizacja;
    ArrayList<Transakcja> transkacje = new ArrayList<>();
    public Biletomat(String loko){
        this.rodzajeBiletow = Bilet.Rodzaj.values();
        this.lokalizacja = loko;
    }
    public void dostepneBilety(){
        System.out.println("Dostepne bilety:");
        for (Bilet.Rodzaj rodzaj:rodzajeBiletow) {
            System.out.println(rodzaj);
        }
    }
    public void kupBilet(Bilet.Rodzaj typBiletu, int iloscBiletow, LocalDate data){
        double dochod = typBiletu.cena * iloscBiletow;
        transkacje.add(new Transakcja(data,typBiletu,iloscBiletow,dochod));
    }
    public void wydrukujTransakcje(LocalDate data){
        for (Transakcja transakcja:transkacje) {
            if(transakcja.getData().isEqual(data)){
                System.out.println(transakcja);
            }
        }
    }
}
