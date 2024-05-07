package edu.fleschi;

import static java.awt.SystemColor.info;

public class Angestellter extends Mitarbeiter {

    private final int grundgehalt;
    private final int ueberstunden;

    public Angestellter(String name, String kontoNummer, int grundgehalt, int ueberstunden) {
        super(name, kontoNummer);
        this.grundgehalt = grundgehalt;
        this.ueberstunden = ueberstunden;
    }

    @Override
    public String getInfo() {
        String info =  super.getInfo();
        return info + ", grundgehalt=" + grundgehalt + ", ueberstunden=" + ueberstunden;
    }
}
