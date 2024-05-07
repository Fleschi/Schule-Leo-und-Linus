package edu.viergewinnt;

public class platte {

int einfuegewert;

    public void einfügen(int xStelle, String farbe ){
        if (farbe != "rot" && farbe != "gelb") {
            farbe = "";
        }

        //Einfügewert stellt Plattenfarbe darr, wobei 1 Rot und -1 Gelb ist

        if (farbe == "rot")  {
            einfuegewert = 1;
        }
        if (farbe == "gelb")
            einfuegewert = -1;

        for(int yLaenge = 0; yLaenge<6; yLaenge++) {
            if (brett.brett[xStelle][yLaenge + 1] == 0) {
                if (einfuegewert == 1)
                    brett.brett[xStelle][yLaenge] = 1;
                if (einfuegewert == -1)
                    brett.brett[xStelle][yLaenge] = -1;
            }
        }


    }
}
