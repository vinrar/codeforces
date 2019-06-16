package ECR66DIV2;

import java.util.Scanner;
import java.io.PrintWriter;

public class ANauuoAndVotes {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if(x == y && z == 0) {
            out.println("0");
        } else if(y + z >= x && x + z >= y) {
            out.println("?");
        } else if(x > y + z) {
            out.println("+");
        } else if(y > x + z) {
            out.println("-");
        }
    }
}
