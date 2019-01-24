package CF535DIV3;

import java.util.Scanner;
import java.io.PrintWriter;

public class ATwoDistinctPoints {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        while(n -- > 0 ){
            int l1 = in.nextInt();
            int r1 = in.nextInt();
            int l2 = in.nextInt();
            int r2 = in.nextInt();
            if(r1 != r2) {
                out.println(r1 + " " + r2);
                continue;
            }

            out.println(l1 + " " + r2);
        }
    }
}
