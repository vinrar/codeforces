package ECR66DIV2;

import java.util.ArrayList;
import java.util.Scanner;

public class B1172 {
    //Nauuo and the chess board
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 1;
        int y = 1;
        ArrayList<Integer> xx = new ArrayList<>();
        ArrayList<Integer> yy = new ArrayList<>();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            xx.add(x);
            yy.add(y);
            m = Math.max(m, x);
            m = Math.max(m, y);
            if (i % 2 == 1) {
                y++;
            } else {
                x++;
            }
        }
        System.out.println(m);
        for (int i = 0; i < n; i++) {
            System.out.println(xx.get(i) + " " + yy.get(i));
        }
    }
}
