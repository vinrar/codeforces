package CF534DIV2;

import java.util.Scanner;
import java.io.PrintWriter;

public class ASplittingIntoDigits {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.println(n);
        for (int i = 0; i < n; i++) out.print(1 + " ");
//        int n = in.nextInt();
//        int nums = 1001;
//        if(n == 1)
//            nums = 1;
//        int div = 1;
//        int rem = 0;
//        for(int i = 1; i <= 9; i++) {
//            if(i == n || i > n){
//                continue;
//            }
//            int local = n / i;
//            int remL = n % i;
//            if(remL > 0){
//                local += 1;
//            }
//            if(local < nums) {
//                nums = local;
//                div = i;
//                rem = remL;
//            }
//        }
//
//        if(rem > 0)
//            nums -= 1;
//
//        out.println(nums);
////        if(div == 9 && rem > 0){
////
////        }
//        for(int i = 0; i < nums; i++){
//            out.print(div + " ");
//        }
//        if(rem > 0)
//            out.print(rem);
    }
}
