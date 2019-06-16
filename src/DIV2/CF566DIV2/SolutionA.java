package DIV2.CF566DIV2;

import java.util.Scanner;

public class SolutionA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 == 1)
            System.out.println(0);
        else {
            long value = (long)Math.pow(2, n/2);
            System.out.println(value);
        }
    }
}
