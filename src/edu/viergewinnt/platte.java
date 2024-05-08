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

        for(int yLaenge = 6; yLaenge>0; yLaenge--) {
            if (brett.brett[xStelle][yLaenge] == 0) {
                if (einfuegewert == 1){
                    brett.brett[xStelle][yLaenge] = 1;
					}					
                if (einfuegewert == -1){
                    brett.brett[xStelle][yLaenge] = -1;
					}
				if (brett.brett[xStelle][6] != 0){
					einfuegewert = 0;
					}
					
            }
        }
		//Gucken, ob einer 4 Punkte hat
		for (int platziert = 0; platziert<7; platziert++)
			if (brett.brett[xStelle][platziert] == brett.brett[xStelle][platziert+1]
)

    }
}
