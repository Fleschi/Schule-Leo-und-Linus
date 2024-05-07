package edu.fleschi;

public class Manager extends  Mitarbeiter{
    private String abteilung;
    private int monatsgehalt;

    public Manager (String name, String kontoNummer, String abteilung, int monatsgehalt) {
        super(name, kontoNummer);
        this.abteilung = abteilung;
        this.monatsgehalt = monatsgehalt;
    }
}
