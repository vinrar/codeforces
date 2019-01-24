package ECR58;

import java.util.Scanner;
import java.io.PrintWriter;

public class AMinimumInteger {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int tc = in.nextInt();
        while(tc-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            int d = in.nextInt();

            if (d < l || d > r) {
                out.println(d);
            } else {
                out.println(d * ((r / d) + 1));
            }
        }
    }
}
