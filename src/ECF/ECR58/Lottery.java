package ECF.ECR58;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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

        System.out.println(sum);
    }
}
