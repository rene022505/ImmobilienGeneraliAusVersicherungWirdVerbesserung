public abstract class Mitarbeiter {

    int personalNummer;
    String name;
    double grundgehalt;

    Mitarbeiter(int nr, String name, double gehalt) {
        this.personalNummer = nr;
        this.name = name;
        this.grundgehalt = gehalt;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }

    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double ermittleGehalt();
}
