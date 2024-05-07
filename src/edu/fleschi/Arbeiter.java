package edu.fleschi;

public class Arbeiter extends Mitarbeiter {

    private final int stundenlohn;
    private final int wochenstunden;

    public Arbeiter(String name, String kontoNummer, int stundenlohn, int wochenstunden){
        super(name, kontoNummer);
        this.stundenlohn = stundenlohn;
        this.wochenstunden = wochenstunden;
    }
}
