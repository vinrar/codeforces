package ECF.ECR88;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
//        Scanner scanner = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();

            int numberOfCardsPerPlayer = n / k;
            if (numberOfCardsPerPlayer >= m) {
                out.println(m);
            } else {
                m -= numberOfCardsPerPlayer;
                int jokersPerPlayer = m / (k - 1);
                int remainingJokers = m % (k - 1);

                if (remainingJokers == 0) {
                    out.println(numberOfCardsPerPlayer - jokersPerPlayer);
                } else {
                    out.println(numberOfCardsPerPlayer - jokersPerPlayer - 1);
                }
            }
        }
    }
}
