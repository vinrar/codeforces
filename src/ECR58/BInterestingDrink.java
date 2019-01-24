package ECR58;

import java.util.Scanner;
import java.io.PrintWriter;

public class BInterestingDrink {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] prices = new int[100001];
        int max = -1;
        for(int i = 0; i < n; i++) {
            int price = in.nextInt();
            prices[price] += 1;
            if(price > max)
                max = price;
        }

        for(int i = 1; i <= max; i++) {
            prices[i] += prices[i-1];
        }

        int tc = in.nextInt();
        while(tc-- > 0) {
            int money = in.nextInt();
            if(money >= max)
                out.println(prices[max]);
            else
                out.println(prices[money]);
        }
    }
}