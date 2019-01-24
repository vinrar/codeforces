package CF530DIV2;

import java.util.*;
import java.io.PrintWriter;

public class ARomanAndBrowser {
    public ARomanAndBrowser() {
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        Set<Integer> set1 = new HashSet<Integer>(n);
        Set<Integer> setMinus1 = new HashSet<Integer>(n);
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            list.add(x);
            if (x == 1) {
                set1.add(i);
            } else {
                setMinus1.add(i);
            }
        }

        int maxValue = 0;

        for (int i = 0; i < k; i++) {
            Set<Integer> indexes = new HashSet<Integer>();
            for (int j = i; j < n; j += k) {
                indexes.add(j);
            }

            Set<Integer> set1Copy = new HashSet<Integer>(set1);
            Set<Integer> setMinus1Copy = new HashSet<Integer>(setMinus1);

            set1Copy.removeAll(indexes);
            int firstValue = set1Copy.size();
            setMinus1Copy.removeAll(indexes);
            int secondValue = setMinus1Copy.size();

            if (Math.abs(firstValue - secondValue) > maxValue) {
                maxValue = Math.abs(firstValue - secondValue);
            }
        }

        out.println(maxValue);
    }
}
