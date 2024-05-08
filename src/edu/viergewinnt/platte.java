package edu.viergewinnt;

public class platte {

int einfuegewert;
int zähler;
    public void einfügen(int xStelle, String farbe ) {
        if (farbe != "rot" && farbe != "gelb") {
            farbe = "";
        }

        //Einfügewert stellt Plattenfarbe darr, wobei 1 Rot und -1 Gelb ist

        if (farbe == "rot") {
            einfuegewert = 1;
        }
        if (farbe == "gelb")
            einfuegewert = -1;

        for (int yStelle = 6; yStelle > 0; yStelle--) {
            if (brett.brett[xStelle][yStelle] == 0) {
                if (einfuegewert == 1) {
                    brett.brett[xStelle][yStelle] = 1;
                    for (int i = 0; i < 4; i++) {
                        //Hier wird geguckt, ob der Spieler vertikal ein 4 Gewinnt hat
                        if (brett.brett[xStelle][yStelle] == brett.brett[xStelle][yStelle + i]) {
                            zähler++;
                        }
                        // Hier wird geprintet, dass der Spieler gewonnen hat, falls "zähler 4 ist"


                    }
                    if (zähler == 4) {
                        System.out.print("Spieler" + farbe + "hat gewonnen");
                    }
                    if (einfuegewert == -1) {
                        brett.brett[xStelle][yStelle] = -1;
                    }
                    if (brett.brett[xStelle][6] != 0) {
                        einfuegewert = 0;
                    }

                }
            }
            //Gucken, ob einer 4 Punkte hat
            for (int platziert = 0; platziert < 7; platziert++)
                if (brett.brett[xStelle][platziert] == brett.brett[xStelle][platziert + 1]) {

                }
        }
    }
}
