import java.util.ArrayList;

public class Abteilung {

    private String name;
    private ArrayList<Mitarbeiter> mitarbeiterArrayList = new ArrayList<>();

    Abteilung(String name) {
        this.name = name;
    }

    public void neuerMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiterArrayList.add(mitarbeiter);
    }

    public double ermittlePersonalkosten() {
        double personalKosten = 0;
        for (Mitarbeiter m : this.mitarbeiterArrayList) {
            personalKosten += m.ermittleGehalt();
        }
        return personalKosten;
    }

}
