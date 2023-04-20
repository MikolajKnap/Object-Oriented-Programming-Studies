package overload;

public class Plane {
    private double rangeInKilometers;
    private double fuelInLitres;

    public void fill(){
        fuelInLitres += 1000.0;
    }
    public void fill(double fuelInLitres){
        this.fuelInLitres += fuelInLitres;
    }

    public double getFuelInLitres() {
        return fuelInLitres;
    }
}
