import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vinrar
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
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
}

