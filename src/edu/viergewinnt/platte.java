package edu.viergewinnt;

public class platte {

    int inputValue;
    int counter;
    int looper;

    public void einfügen(int xStelle, String farbe) {
        if (farbe != "rot" && farbe != "gelb") {
            farbe = "";
        }

        //Einfügewert stellt Plattenfarbe dar, wobei 1 Rot und -1 Gelb ist

        if (farbe == "rot") {
            inputValue = 1;
        }

        if (farbe == "gelb") {
            inputValue = -1;
        }
        //Das ist die Loop um eine Platte zu platzieren
        for (int yStelle = 6; yStelle > -1; yStelle--) {
            while (brett.brett[yStelle][xStelle] != 0) {
                brett.brett[yStelle - 1][xStelle] = inputValue;
            }
            if (brett.brett[0][xStelle] != 0) {
                System.out.println("Reihe" + xStelle + "ist bereits voll");
            }
        }
    }

    public void gewinnerFinden(){
        //Hier wird geguckt, ob ein Spieler 4 in irgendeiner Weise hat
        for (int yStelle = 0; yStelle < 6; yStelle++){
            //Hier wird geguckt, ob ein Spieler 4 in einer Vertikalen Linie hat
            if (yStelle <= 2) {
                if (brett.brett[yStelle][xStelle] == brett.brett[yStelle - 1][xStelle]) {
                    counter++;

                }
            }
            //Hier wird geguckt, ob ein Spieler 4 von unten Links nach oben Rechts hat
            for (int looper = 0; looper < 4; looper++) {
                if (brett.brett[yStelle][xStelle] == brett.brett[yStelle + looper][xStelle + looper]) {
                    counter++;
                }
                if (yStelle <= 5) {
                    if (brett.brett[yStelle][xStelle] == brett.brett[yStelle + looper][xStelle - looper]) {
                        counter++;
                    }

                }
            }
        }
    }



    //Hier wird geguckt, ob ein Spieler 4 in einer horizantelen Linie hat
        if (xStelle-1 =< 3) {
        //wenn es zu nah am linken Rand platziert wird guckt es bis zum linken Rand und dann nach rechts
        for (int looper = 0; looper < 3; looper++) {
            while (brett.brett[yStelle][xStelle]==brett.brett[yStelle][xStelle-looper] {
                counter++;
            }
        }
        for (int looper = 0; looper < 3; looper++) {

            if (counter==4) {
                break;
            }
            while (brett.brett[yStelle][xStelle]==brett.brett[yStelle][xStelle+looper]) {
                if (counter==4) {
                    break;
                }

            }
        }
    } else {
        //wenn es nicht zu nah am linken rand platziert ist guckt es 3 nach links und dann 3 nach rechts
    }


    //Hier wird geguckt, ob ein Spieler 4 von oben Links nach unten Rechts hat

            for (int looper = 0; looper < 4; looper++) {
        if (brett.brett[yStelle][xStelle] == brett.brett[yStelle + looper][xStelle + looper]){
            counter++;
        }
        if (yStelle>=0)
    }




    // Hier wird geprintet, dass der Spieler gewonnen hat, falls er 4 in einer Reihe hat
                if (counter >= 4) {
        System.out.print("Spieler" + farbe + "hat gewonnen");
    }
    }
}