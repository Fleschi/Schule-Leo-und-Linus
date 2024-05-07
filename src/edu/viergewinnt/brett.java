package edu.viergewinnt;
/* x-Länge 7
   y-Länge 6
 */

public class brett {
    static int[][] brett = new int[6][5];

    public void brettErstellen() {
        for (int xLaenge = 0; xLaenge < 7; xLaenge++) {
            for (int yLaenge = 0; yLaenge < 6; yLaenge++) {
                brett[yLaenge][xLaenge] = 0;
            }
        }
    }
}
