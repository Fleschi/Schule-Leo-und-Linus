package edu.viergewinnt;

public enum Chip {

    ROT("R"),
    BLAU("B");

    private final String farbe;

    Chip(String farbe) {
        this.farbe = farbe;
    }

    public static String getFarbe(Chip c) {
        if (c == null) {
            return " ";
        } else {
            return c.farbe;
        }
    }

}
