package mpk;

public class Bilet {
    public enum Rodzaj {
        Normalny(20.00, "Normalny"),
        Ulgowy(30.00,"Ulgowy");
        final double cena;
        final String nazwa;
        private Rodzaj(double koszt, String nazwaBiletu){
            this.cena = koszt;
            this.nazwa = nazwaBiletu;
        }

        @Override
        public String toString() {
            return nazwa + " : " + cena;
        }
    }

    final private Rodzaj rodzaj;
    final private double cenaB;
    public Bilet(Rodzaj rodzajBiletu, double cenaBiletu){
        this.rodzaj = rodzajBiletu;
        this.cenaB = cenaBiletu;
    }

    public Rodzaj getRodzaj() {
        return rodzaj;
    }

    public double getCena() {
        return cenaB;
    }
}
