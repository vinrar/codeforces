package ECF.ECR58;

import java.util.Scanner;
import java.io.PrintWriter;

public class AHitTheLottery {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int sum = 0;

        sum += n/100;
        n = n%100;
        sum += n/20;
        n = n%20;
        sum += n/10;
        n = n%10;
        sum += n/5;
        n = n%5;
        sum += n;

        out.println(sum);
    }
}
