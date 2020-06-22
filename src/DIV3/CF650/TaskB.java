package DIV3.CF650;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int tc = in.nextInt();
        while (tc -- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];

            int numberOfEvenNumbersInWrongPlaces = 0;
            int numberOfOddNumbersInWrongPlaces = 0;

            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (i % 2 == 0) {
                    if (arr[i] % 2 == 1) {
                        numberOfOddNumbersInWrongPlaces += 1;
                    }
                } else {
                    if (arr[i] % 2 == 0) {
                        numberOfEvenNumbersInWrongPlaces += 1;
                    }
                }
            }

            if(numberOfEvenNumbersInWrongPlaces == numberOfOddNumbersInWrongPlaces) {
                out.println(numberOfEvenNumbersInWrongPlaces);
            } else {
                out.println(-1);
            }
        }
    }
}
