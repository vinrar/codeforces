package ECR58;

import java.util.Scanner;
import java.io.PrintWriter;

public class AKefaAndFirstSteps {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }

        int max = 1;
        int localCount = 1;
        for(int i = 1; i < n; i++){

            if(list[i] >= list[i-1]){
                ++localCount;
                if(max < localCount)
                    max = localCount;
            } else{
                localCount = 1;
            }
        }

        out.println(max);
    }
}