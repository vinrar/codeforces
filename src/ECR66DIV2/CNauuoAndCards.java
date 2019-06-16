package ECR66DIV2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.io.PrintWriter;

public class CNauuoAndCards {

    public static void main(String[] args) {
        solve(1);
    }
    //public void solve(int testNumber, Scanner in, PrintWriter out) {
    public static void solve(int testNumber) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //System.out.println("o1: " + o1 + " o2: " + o2 + " Diff: " + (o1 - o2));
                return o1.compareTo(o2);
            }
        });

        for(int i = 0; i < n; i++) {
            int inp = in.nextInt();
            queue.add(inp);
        }

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}