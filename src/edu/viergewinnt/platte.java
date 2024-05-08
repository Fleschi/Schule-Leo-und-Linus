package edu.viergewinnt;

public class platte {

    int inputValue;
    int counter;


    public int einfügen(int xStelle, String farbe) {
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
            while (brett.brett[yStelle][xStelle - 1 ] != 0) {
                brett.brett[yStelle - 1][xStelle - 1] = inputValue;
            }
            if (brett.brett[0][xStelle-1] != 0) {
                break;
                System.out.println("Reihe" + xStelle + "ist bereits voll");
            }
        }
    }

    public void gewinnerFinden(int xStelle, String farbe){
        //Hier wird geguckt, ob ein Spieler 4 in irgendeiner Weise hat
        for (int yStelle = 0; yStelle < 6; yStelle++){
            //Hier wird geguckt, ob ein Spieler 4 in einer Vertikalen Linie hat
            if (yStelle>=2) {
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
                if (counter == 4) {
                    break;
                }
            }

            //Hier wird geguckt, ob ein Spieler 4 von oben Links nach unten Rechts hat

            for (int looper = 0; looper < 4; looper++) {
                if (brett.brett[yStelle][xStelle] == brett.brett[yStelle + looper][xStelle + looper]) {
                    counter++;
                }
                if (yStelle > 0)
                    if (brett.brett[yStelle][xStelle] == brett.brett[yStelle - looper][xStelle - looper]) {
                        counter++;
                    }
                }
                if (counter == 4) {
                    break;
                }
            }



            //Hier wird geguckt, ob ein Spieler 4 horizontal hat

            for (int i = 0; i<4; i++) {
                while (brett.brett[yStelle][xStelle] == brett.brett[yStelle][xStelle - i]) {
                    if (xStelle - 1 -i == 0) {
                        break;
                    }
                    counter++;
                    if (counter == 4) {
                        break;
                    }
                }
                while (brett.brett[yStelle][xStelle]==brett.brett[yStelle][xStelle+i]) {
                    if (xStelle -1 +i == 7) {
                        break;
                    }
                    counter++;
                    if (counter == 4) {
                        break;
                    }
                }
            }



        }
        // Hier wird geprintet, dass der Spieler gewonnen hat, falls er 4 in einer Reihe hat
        if (counter >= 4) {
            System.out.print("Spieler" + farbe + "hat gewonnen");
        }
    }














    }
}