package CF534DIV2;

import java.util.Scanner;
import java.io.PrintWriter;

public class CGridGame {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int[][] arr = new int[5][5];

        String input = in.nextLine();
        for(int i = 0; i < input.length(); i++) {
            checkIfRowCanBeCleared(arr);
            int val = Integer.parseInt(String.valueOf(input.charAt(i)));
            if(val == 0){
                insertInEmptySpaces(arr, 0, out);
            } else {
                insertInEmptySpaces(arr ,1, out);
            }
        }
    }

    private static void checkIfRowCanBeCleared(int[][] arr) {
        for (int i = 1; i < 5; i++) {
            if(arr[i][1] == arr[i][2] && arr[i][1] == arr[i][3] && arr[i][1] == arr[i][4]){
                arr[i][1] = 0;
                arr[i][2] = 0;
                arr[i][3] = 0;
                arr[i][4] = 0;
            }
        }

        for (int j = 1; j < 5; j++) {
            if(arr[1][j] == arr[2][j] && arr[1][j] == arr[3][j] && arr[1][j] == arr[4][j]){
                arr[1][j] = 0;
                arr[2][j] = 0;
                arr[3][j] = 0;
                arr[4][j] = 0;
            }
        }
    }

    public static void insertInEmptySpaces(int[][] arr, int val, PrintWriter out) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (val == 0) {
                    if (i + 1 < 5 && arr[i][j] == 0 && arr[i + 1][j] == 0) {
                        out.println(i + " " + j);
                        arr[i][j] = 1;
                        arr[i + 1][j] = 1;
                        return;
                    }
                } else {
                    if (j + 1 < 5 && arr[i][j] == 0 && arr[i][j + 1] == 0) {
                        out.println(i + " " + j);
                        arr[i][j] = 1;
                        arr[i][j + 1] = 1;
                        return;
                    }
                }
            }
        }
    }
}