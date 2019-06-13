package DIV2.CF530DIV2;

import java.util.*;
import java.io.PrintWriter;

public class BBuildAContest {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        Set<Integer> setElements = new HashSet<Integer>(n);
        List<Integer> inputList = new ArrayList<Integer>(n + 1);
        for(int i = 0; i <= n; i++){
            inputList.add(0);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){
            int input = in.nextInt();
            inputList.set(input, inputList.get(input) + 1);
            setElements.add(input);
            if(canHeHoldARound(n, setElements, inputList)) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        out.println(sb);
    }

    private static boolean canHeHoldARound(int n, Set<Integer> setElements, List<Integer> inputList){
        if(setElements.size() == n){
            setElements.clear();
            for(int i = 1; i <= n; i++){
                int value = inputList.get(i);
                inputList.set(i, value - 1);
                if(value > 1)
                    setElements.add(i);
            }
            return true;
        }
        return false;
    }
}
