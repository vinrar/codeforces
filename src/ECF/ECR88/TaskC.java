package ECF.ECR88;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int tc = in.nextInt();
        while (tc-- > 0) {
            double h = in.nextInt() + 0.0f;
            double c = in.nextInt() + 0.0f;
            double t = in.nextInt() + 0.0f;

            double mean = (h + c) / 2;
            if (t <= mean) {
                out.println(2);
            } else if (t >= h) {
                out.println(1);
            } else {
                int x = (int)((h - t) / (2 * t - h - c));

                double delta = Double.MAX_VALUE;
                int output = 0;
                for (int i = -3; i < 4; i++) {
                    int n = x + i;
                    double currentDelta = Math.abs(t - ((n * (h + c) + h)/(2 * n + 1)));
                    if (currentDelta < delta) {
                        delta = currentDelta;
                        output = n;
                    }
                }

                out.println(2 * output + 1);
            }
        }
    }
}