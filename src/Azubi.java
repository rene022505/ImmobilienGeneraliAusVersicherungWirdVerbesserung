public class Azubi extends Mitarbeiter {

    private int lehrjahr;

    Azubi(int nr, String name) {
        super(nr, name, (double) 500);
    }

    public void naechstesLehrjahr() {
        lehrjahr++;
        this.grundgehalt += 100;
    }

    @Override
    public double ermittleGehalt() {
        return this.grundgehalt;
    }
}
