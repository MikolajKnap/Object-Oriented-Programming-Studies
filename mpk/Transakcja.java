package mpk;

import java.time.LocalDate;

public class Transakcja {
    private LocalDate data;
    private Bilet.Rodzaj rodzaj;
    private int liczbaBiletow;
    private double price;

    public Transakcja(LocalDate data, Bilet.Rodzaj rodzaj, int liczbaBiletow, double price) {
        this.data = data;
        this.rodzaj = rodzaj;
        this.liczbaBiletow = liczbaBiletow;
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }
    public Bilet.Rodzaj getRodzaj() {
        return rodzaj;
    }
    public int getLiczbaBiletow() {
        return liczbaBiletow;
    }
    public double getDochod() {
        return price;
    }

    @Override
    public String toString() {
        return  data +
                " : " + rodzaj.nazwa +
                " : " + liczbaBiletow +
                " : " + price ;
    }
}
