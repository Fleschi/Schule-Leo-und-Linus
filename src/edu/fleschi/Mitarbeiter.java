package edu.fleschi;

public abstract class Mitarbeiter {

    protected final String name;
    protected final String kontoNummer;

    protected Mitarbeiter(String name, String kontoNummer) {
        this.name = name;
        this.kontoNummer = kontoNummer;
    }

    public String getInfo() {
        return "name=" + name + ", kontoNr=" + kontoNummer;
    }

    public static void main(String[] args) {
        Mitarbeiter m  = new Angestellter("Juli", "DE503125122000004547783", 800, 4);
        System.err.println(m.getInfo());
    }


}
