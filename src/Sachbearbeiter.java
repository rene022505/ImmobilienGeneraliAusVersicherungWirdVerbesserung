public class Sachbearbeiter extends Mitarbeiter {

    private String sachgebiet;

    Sachbearbeiter(int nr, String name, double gehalt, String gebiet) {
        super(nr, name, gehalt);
        this.sachgebiet = gebiet;
    }

    @Override
    public double ermittleGehalt() {
        return this.grundgehalt;
    }
}
