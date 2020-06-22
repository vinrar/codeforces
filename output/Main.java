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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int tc = in.nextInt();

            while (tc-- > 0) {
                int n = in.nextInt();
                int k = in.nextInt();

                String table = in.next();
                int[] leftArray = new int[n];
                int[] rightArray = new int[n];
                int distance = k;
                for (int i = 0; i < table.length(); i++) {
                    if (distance > k)
                        distance = 0;
                    if (table.charAt(i) == '0') {
                        distance += 1;
                        leftArray[i] = distance;
                    } else {
                        leftArray[i] = 0;
                        distance = 0;
                    }
                }

                distance = k;
                for (int i = table.length() - 1; i >= 0; i--) {
                    if (table.charAt(i) == '0') {
                        distance += 1;
                        rightArray[i] = distance;
                    } else {
                        leftArray[i] = 0;
                        distance = 0;
                    }
                }

                int count = 0;

                for (int i = 0; i < table.length(); i++) {
                    if (leftArray[i] > k && rightArray[i] > k) {
                        count += 1;
                    }
                }

                out.println(count);
            }
        }

    }
}

