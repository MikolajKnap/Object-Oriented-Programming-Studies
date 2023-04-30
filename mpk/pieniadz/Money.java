package mpk.pieniadz;

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
