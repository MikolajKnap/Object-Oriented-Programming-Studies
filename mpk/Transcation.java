package mpk;

import java.time.LocalDate;

public class Transcation {
    private LocalDate data;
    private Ticket rodzaj;
    private int liczbaBiletow;
    private double price;

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
