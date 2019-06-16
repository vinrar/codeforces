package DIV2.CF567DIV2;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class BSplitANumber {
    public static void main(String[] args) {
        //solve();
    }
    public void solve(int testNumber, Scanner in, PrintWriter out) {
//    public static void solve() {
//        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] arr = in.next().toCharArray();
        BigInteger left = new BigInteger("0");
        BigInteger right = new BigInteger("0");
        for(int i = 0; i <= n/2; i++) {
            if(i != 0)
                left = left.multiply(new BigInteger("10"));

            left = left.add(new BigInteger(String.valueOf(arr[i])));
        }

        for(int i = n/2; i < n; i++) {
            if(i != n/2)
                right = right.multiply(new BigInteger("10"));

            right = right.add(new BigInteger(String.valueOf(arr[i])));
        }

        BigInteger leftLT = new BigInteger(left.toString());
        BigInteger rightLT = new BigInteger(right.toString());

        BigInteger leftRT = new BigInteger(left.toString());
        BigInteger rightRT = new BigInteger(right.toString());

        BigInteger ten = new BigInteger("10");
        BigInteger sum = null;

        int firstDigit = Character.getNumericValue(arr[0]);
        int splitIndex = n/2;

        int rightDigit = Character.getNumericValue(arr[n/2 + 1]);
        if(rightDigit != 0) {
            if(Character.getNumericValue(arr[n/2]) != 0) {
                if(leftLT.compareTo(rightLT) > 0) {
                    leftLT = leftLT.divide(ten);
                } else {
                    rightLT = rightLT.remainder(ten.pow(n/2));
                }
            }
            sum = leftLT.add(rightLT);
            System.out.println(sum.toString());
        } else {
            for(int i = 1; i < n/2; i++) {
                int rightDigitLT = Character.getNumericValue(arr[n/2 - i + 1]);
                leftLT = leftLT.divide(ten);
                BigInteger topLT = new BigInteger(String.valueOf(arr[n/2 - i]));
                topLT.multiply(ten.pow(n/2 + i));
                rightLT = rightLT.add(topLT);

                int rightDigitRT = Character.getNumericValue(arr[n/2 + i + 1]);
                leftRT = leftRT.multiply(ten);
                leftRT.add(new BigInteger(String.valueOf(arr[n/2 + i])));
                rightLT = rightLT.remainder(ten.pow(n/2 + i));
                BigInteger sum1 = leftLT.add(rightLT);
                BigInteger sum2 = leftRT.add(rightRT);
                if(rightDigitLT != 0 && rightDigitRT != 0) {
                    if(sum1.compareTo(sum2) > 1) {
                        System.out.println(sum2.toString());
                        return;
                    } else {
                        System.out.println(sum1.toString());
                        return;
                    }
                } else if(rightDigitLT == 0 && rightDigitRT != 0) {
                    System.out.println(sum2.toString());
                    return;
                } else if(rightDigitLT != 0 && rightDigitRT == 0) {
                    System.out.println(sum1.toString());
                    return;
                } else {
                    continue;
                }
            }

            System.out.println(sum.toString());
        }
    }
}