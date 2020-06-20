package ECF.ECR88;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            long totalPrice = 0L;
            for (int i = 0; i < n; i++) {
                String line = in.next();
                int count = 0;
                for (int j = 0; j < m; j++) {
                    char block = line.charAt(j);
                    if (block == '.') {
                        count += 1;
                    } else {
                        if (2 * x > y) {
                            totalPrice += (count / 2) * y;
                            if (count % 2 == 1)
                                totalPrice += x;
                        } else {
                            totalPrice += count * x;
                        }
                        count = 0;
                    }
                }

                if (count > 0) {
                    if (2 * x > y) {
                        totalPrice += (count / 2) * y;
                        if (count % 2 == 1)
                            totalPrice += x;
                    } else {
                        totalPrice += count * x;
                    }
                    count = 0;
                }
            }

            out.println(totalPrice);
        }
    }
}
