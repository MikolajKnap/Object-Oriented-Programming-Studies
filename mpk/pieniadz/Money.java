package mpk.pieniadz;

// Po klasie Money dziedzicza wszystkie rodzaje pieniedzy
public abstract class Money {
    protected double value;

    @Override
    public String toString() {
        return Double.toString(value);
    }

    public double getValue(){
        return this.value;
    }
}
