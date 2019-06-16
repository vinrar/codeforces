package DIV2.CF567DIV2;

import java.util.Scanner;
import java.io.PrintWriter;

public class AChungaChanga {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long y = in.nextLong();
        long z = in.nextLong();

        System.out.print((x + y) / z + " ");

        long rem1 = x % z;
        long rem2 = y % z;

        if(rem1 + rem2 >= z) {
            System.out.print(z - Math.max(rem1, rem2));
        } else {
            System.out.print(0);
        }
    }
}