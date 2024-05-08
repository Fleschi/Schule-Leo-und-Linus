package edu.viergewinnt;
/* x-Länge 7
   y-Länge 6
 */

public class brett {
    static int[][] brett = new int[6][7];

    public void brettErstellen() {
        for (int xLaenge = 0; xLaenge < 7; xLaenge++) {
            for (int yLaenge = 0; yLaenge < 6; yLaenge++) {
                brett[yLaenge][xLaenge] = 0;
            }
        }
    }

    public static void brettPrinten(){
        System.out.println("------------------------------");
        for (int horizontal = 0; horizontal <6 ; horizontal++) {

            for (int vertikal = 0; vertikal < 7; vertikal++){
            System.out.print("| " + brett[horizontal][vertikal] + " ");

            }
            System.out.println(" |");
            System.out.println("------------------------------");
        }
    }
}
