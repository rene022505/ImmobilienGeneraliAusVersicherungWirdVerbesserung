public class mainClass {

    public static void main(String[] args) {
        Abteilung computer = new Abteilung("Computer");

        Sachbearbeiter hm = new Sachbearbeiter(4, "Horst Müller", (double) 2750, "Betriebssysteme");
        Vertriebsmitarbeiter em = new Vertriebsmitarbeiter(3, "Eva Meier", (double) 1500);
        em.setGrenze((double) 15000);
        em.setProzent(5);
        em.setUmsatz((double) 35000);
        Azubi sk = new Azubi(7, "Stefan Kaufman");

        computer.neuerMitarbeiter(hm);
        computer.neuerMitarbeiter(em);
        computer.neuerMitarbeiter(sk);

        System.out.println(computer.ermittlePersonalkosten());
    }

}
