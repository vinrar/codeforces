package ECR58;

import java.util.Scanner;
import java.io.PrintWriter;

public class AQAQ {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String input = in.next();
        String t  = "QAQ";

        int strLen = input.length();
        int subStrLen = t.length();

        int[] dp = new int[subStrLen + 1];
        dp[0] = 1;

        for(int C = 0; C < strLen; C++) {
            for(int X = subStrLen-1; X >=0; X--) {
                if(t.charAt(X) == input.charAt(C)){
                    dp[X+1] += dp[X];
//                    System.out.println(input + " Char At Index: " + C + ": " + input.charAt(C));
//                    System.out.println(t + " Char At Index: " + X + ": " + t.charAt(X));
//                    for(int i = 0; i <= subStrLen; i++){
//                        System.out.println("dp[" + i + "] = " + dp[i]);
//                    }
                }
            }
        }

        out.println(dp[subStrLen]);
    }
}