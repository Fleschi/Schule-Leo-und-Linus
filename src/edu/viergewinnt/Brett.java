package edu.viergewinnt;

import static edu.viergewinnt.Chip.*;


public class Brett {

    private final Chip[][] brett;

    public Brett() {
        this(6, 7);
    }

    public Brett(int zeilenAnzahl, int spaltenAnzahl) {
        this.brett = new Chip[zeilenAnzahl][spaltenAnzahl];
    }

    public boolean chipEinfuegen(Chip chip, int... spaltenIDs) {
        boolean res = false;
        for (int i = 0; i < spaltenIDs.length; i++) {
            res |= chipEinfuegen(chip, spaltenIDs[i]);
        }
        return res;
    }

    public boolean chipEinfuegen(Chip chip, int spaltenID) {
        int x = spaltenID - 1;
        if (chip == null) {
            throw new IllegalArgumentException("Chip argument darf nicht null sein.");
        }
        if (x < 0) {
            throw new IllegalArgumentException("Spaltenargument nicht unterstützt: " + spaltenID + ", Brettgröße ist [" + brett[0].length + "x" + brett.length + "].");
        }
        if (x >= brett[0].length) {
            throw new IllegalArgumentException("Spaltenargument nicht unterstützt: " + spaltenID + ", Brettgröße ist [" + brett[0].length + "x" + brett.length + "].");
        }
        int yi = -1;
        for (int y = 0; y < brett.length; y++) {
            if (brett[y][x] == null) {
                yi = y;
            } else {
                // Zelle belegt, Stein kann nicht weiter fallen
                break;
            }
        }
        if (yi < 0) {
            throw new IllegalArgumentException("Kann keine weiteren Chips in Spalte: " + spaltenID + " einfügen, Brettgröße ist [" + brett[0].length + "x" + brett.length + "].");
        }
        brett[yi][x] = chip;
        return vierGewinnt(yi, x);
    }

    private boolean vierGewinnt(int y, int x) {
        return checkDown(y, x) || checkHorizontal(y, x) || checkDiagRD(y, x) || checkDiagLD(y, x);
    }

    private boolean checkDown(int y, int x) {
        Chip c = brett[y][x];
        if (y > brett.length - 4) {
            return false;
        }
        int counter = 1;
        while (brett[y++][x] == c) {
            if (counter++ == 4) {
                return true;
            }
        }
        return false;
    }

    private boolean checkHorizontal(int y, int x) {
        // 1. find start position of series to the left
        Chip c = brett[y][x];
        while (x > 0 && brett[y][x - 1] == c) {
            x--;
        }
        // 2. count consecutive cells to the right
        int counter = 0;
        while (x < brett[0].length - 1 && brett[y][x] == c) {
            x++;
            counter++;
        }
        return counter >= 4;
    }

    private boolean checkDiagLD(int y, int x) {
        Chip c = brett[y][x];
        int xMax = brett[0].length - 1;
        int yMax = brett.length - 1;
        while (x > 0 && y < yMax && brett[y + 1][x - 1] == c) {
            x--;
            y++;
        }
        int counter = 0;
        while (x <= xMax && y >= 0 && brett[y][x] == c) {
            x++;
            y--;
            counter++;
        }
        return counter >= 4;
    }

    private boolean checkDiagRD(int y, int x) {
        Chip c = brett[y][x];
        while (x > 0 && y > 0 && brett[y - 1][x - 1] == c) {
            y--;
            x--;
        }
        int counter = 0;
        int xMax = brett[0].length - 1;
        int yMax = brett.length - 1;
        while (x <= xMax && y <= yMax && brett[y][x] == c) {
            x++;
            y++;
            counter++;
        }
        return counter >= 4;
    }

    @Override
    public String toString() {
        String line = createLine(brett[0].length);
        StringBuilder res = new StringBuilder(line + "\n");
        for (int y = 0; y < brett.length; y++) {
            for (int x = 0; x < brett[0].length; x++) {
                res.append("| ").append(Chip.getFarbe(brett[y][x])).append(" ");
            }
            res.append("|\n");
        }
        res.append(line);
        return res.toString();
    }

    private String createLine(int spaltenanzahl) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < spaltenanzahl; x++) {
            sb.append("----");
        }
        return "" + sb + "-";
    }

    public static void main(String[] args) {
        Brett brett = new Brett();
        boolean res = false;
        res |= brett.chipEinfuegen(BLAU, 5, 6, 6, 7, 7, 7);
        res |= brett.chipEinfuegen(ROT, 4, 5, 6, 7);

        System.err.println(brett);
        System.err.println("Vier gewinnt: " + res);
    }
}
