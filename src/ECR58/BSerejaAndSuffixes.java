package ECR58;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class BSerejaAndSuffixes {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n; i++){
            arr[i] = in.nextInt();
        }
        int[] score = new int[n + 1];

        Set<Integer> set = new HashSet<>();
        score[n] = 1;
        set.add(arr[n]);

        for(int i = n-1; i > 0; i--){
            if(!set.contains(arr[i])){
                score[i] += 1;
                set.add(arr[i]);
            }

            score[i] += score[i+1];
        }

        for(int i = 1; i <= m; i++){
            out.println(score[in.nextInt()]);
        }
    }
}