package ECR66DIV2;

import java.util.Scanner;
import java.io.PrintWriter;

public class DArraySplitting {

    public static void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int num[] = new int[n];
        long sum[] = new long[n];

        num[0] = in.nextInt();

        for(int i = 1; i < n; i++) {
            num[i] = in.nextInt();
        }

        sum[n-1] = num[n-1];

        for(int i = n-2; i >= 0; i--) {
            sum[i] = sum[i + 1] + num[i];
        }

        long cost = 0;

        int highestSumIndex = n-1;
        int prevHighIndex = n-1;
        cost += k * num[highestSumIndex];
        for(int j = k; j > 0; j--) {
            for(int i = highestSumIndex; i >= j-1; i--) {
                if(sum[i] > sum[highestSumIndex]) {
                    highestSumIndex = i;
                }
            }
            if(j == 1)
                highestSumIndex = 0;
            cost += j * (sum[highestSumIndex] - sum[prevHighIndex]);
            prevHighIndex = highestSumIndex;
            highestSumIndex -= 1;
        }

        System.out.println(cost);
    }
}