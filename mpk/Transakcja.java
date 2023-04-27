package mpk;

import java.time.LocalDate;

public class Transakcja {
    private LocalDate data;
    private Bilet.Rodzaj rodzaj;
    private int liczbaBiletow;
    private double dochod;

    public Transakcja(LocalDate data, Bilet.Rodzaj rodzaj, int liczbaBiletow, double dochod) {
        this.data = data;
        this.rodzaj = rodzaj;
        this.liczbaBiletow = liczbaBiletow;
        this.dochod = dochod;
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
        return dochod;
    }

    @Override
    public String toString() {
        return  data +
                " : " + rodzaj.nazwa +
                " : " + liczbaBiletow +
                " : " + dochod ;
    }
}
