public class Vertriebsmitarbeiter extends Mitarbeiter {

    private double umsatz, grenze;
    private int prozent;

    Vertriebsmitarbeiter(int nr, String name, double gehalt) {
        super(nr, name, gehalt);
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public void setGrenze(double grenze) {
        this.grenze = grenze;
    }

    public void setProzent(int prozent) {
        this.prozent = prozent;
    }

    @Override
    public double ermittleGehalt() {
        return this.umsatz > this.grenze ? this.grundgehalt + (this.umsatz * (this.prozent / 100.0)) : this.grundgehalt;
    }
}
