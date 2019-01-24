package CF534DIV2;

import java.util.Scanner;
import java.io.PrintWriter;

public class BGameWithString {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        StringBuilder sb = new StringBuilder(in.nextLine());
        boolean firstPlayerTurn = true;

        while(findIndex(sb) != -1){
            if(firstPlayerTurn)
                firstPlayerTurn = false;
            else
                firstPlayerTurn = true;
        }

        if(firstPlayerTurn)
            out.println("No");
        else
            out.println("Yes");
    }

    public static int findIndex(StringBuilder sb){
        if(sb.length() == 0 || sb.length() == 1)
            return -1;
        for(int i = 0; i < sb.length() - 1; i++) {
            if(sb.charAt(i) == sb.charAt(i + 1)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return i;
            }
        }

        return -1;
    }
}