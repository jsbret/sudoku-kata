package org.sudoku;


public class Sudoku {
    public static void main(String[] args) {
        int[][] p = new int[9][9]; // board
        for (int n = 0; n < args.length; ++n) {
            int i = n / 3;
            int j = n % 3 * 3;

            int le = Integer.parseInt(args[n].substring(0, 1));
            int ce = Integer.parseInt(args[n].substring(1, 2));
            int ri = Integer.parseInt(args[n].substring(2, 3));
            p[i][j] = le;
            p[i][j + 1] = ce;
            p[i][j + 2] = ri;
        }
        int[][] b = p;
        for (int i1 = 0; i1 < 9; ++i1) {
            if (i1 % 3 == 0)
                System.out.println(" -----------------------");
            for (int j1 = 0; j1 < 9; ++j1) {
                if (j1 % 3 == 0) System.out.print("| ");
                System.out.print(b[i1][j1] == 0
                        ? " "
                        : Integer.toString(b[i1][j1]));

                System.out.print(' ');
            }
            System.out.println("|");
        }
        System.out.println(" -----------------------");
        if (sve(0, 0, b)) {
            for (int i = 0; i < 9; ++i) {
                if (i % 3 == 0)
                    System.out.println(" -----------------------");
                for (int j = 0; j < 9; ++j) {
                    if (j % 3 == 0) System.out.print("| ");
                    System.out.print(b[i][j] == 0
                            ? " "
                            : Integer.toString(b[i][j]));

                    System.out.print(' ');
                }
                System.out.println("|");
            }
            System.out.println(" -----------------------");
        } else
            System.out.println("NO SOLUTION");
    }

    //recursive solve
    static boolean sve(int i, int j, int[][] cells) {
        if (i == 9) {
            i = 0;
            if (++j == 9)
                return true;
        }
        if (cells[i][j] != 0)  // skip filled cells
            return sve(i + 1, j, cells);

        for (int val = 1; val <= 9; ++val) {
            boolean ok = true;

            for (int k = 0; k < 9; ++k)  // row
                if (val == cells[k][j])
                    ok = false;

            for (int k = 0; k < 9; ++k) // col
                if (val == cells[i][k])
                    ok = false;

            int boxRowOffset = (i / 3) * 3;
            int boxColOffset = (j / 3) * 3;
            for (int k = 0; k < 3; ++k) // box
                for (int m = 0; m < 3; ++m)
                    if (val == cells[boxRowOffset + k][boxColOffset + m])
                        ok = false;
            if (ok) {
                cells[i][j] = val;
                if (sve(i + 1, j, cells))
                    return true;
            }
        }
        cells[i][j] = 0;
        return false;
    }

}
