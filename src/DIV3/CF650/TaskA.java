package DIV3.CF650;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int q = in.nextInt();

        while(q-- > 0) {
            StringBuilder sb = new StringBuilder();
            String s = in.next();
            sb.append(s.charAt(0));
            for(int i = 1; i < s.length() - 1; i = i + 2) {
                sb.append(s.charAt(i));
            }
            sb.append(s.charAt(s.length() - 1));
            out.println(sb.toString());
        }
    }
}
