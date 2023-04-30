package mpk;

import java.time.LocalDate;

public class Transcation {
    private final LocalDate data;
    private final Ticket rodzaj;
    private final int liczbaBiletow;
    private final double price;

    public Transcation(LocalDate data, Ticket rodzaj, int liczbaBiletow, double price) {
        this.data = data;
        this.rodzaj = rodzaj;
        this.liczbaBiletow = liczbaBiletow;
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }
    public Ticket getRodzaj() {
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
                " : " + rodzaj.name +
                " : " + liczbaBiletow +
                " : " + price ;
    }
}
