package ECF.ECR88;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int finalSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int maxSoFar = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (maxSoFar < arr[j]) {
                    maxSoFar = arr[j];
                }
                sum += arr[j];

                int localSum = sum - maxSoFar;
                if (localSum > finalSum) {
                    finalSum = localSum;
                }
            }

        }
        out.println(finalSum);
    }
}
