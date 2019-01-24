package CF535DIV3;

import java.util.*;
import java.io.PrintWriter;

public class CNiceGarland {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] input = in.next().toCharArray();
        boolean rf = false;
        boolean bf = false;
        boolean gf = false;

        if(n == 1){
            out.println("0");
            out.print(input[0]);
            return;
        }

        if(n == 2){
            if(input[0] != input[1]){
                out.println("0");
                out.print(input[0] + "" +input[1]);
                return;
            } else {
                out.println("1");
                char secondChar = 'G';
                if(secondChar == input[0])
                    secondChar = 'B';
                out.println("1");
                out.print(input[0] + secondChar);
                return;
            }
        }

        int[] rc = new int[3];
        int[] gc = new int[3];
        int[] bc = new int[3];

        for(int i = 0; i < n; i++) {
            if(input[i] == 'R'){
                rc[i%3] += 1;
            } else if(input[i] == 'G'){
                gc[i%3] += 1;
            } else if(input[i] == 'B'){
                bc[i%3] += 1;
            }
        }

        int max = 0;
        char ch = 'z';
        int index = -1;
        for(int i = 0; i < 1; i++){
            if(rc[i] > max){
                max = rc[i];
                ch = 'R';
                index = i;
            }
            if(bc[i] > max){
                max = bc[i];
                ch = 'B';
                index = i;
            }
            if(gc[i] > max){
                max = gc[i];
                ch = 'G';
                index = i;
            }
        }

        List<Integer> li = new ArrayList<>(3);
        li.add(0);
        li.add(1);
        li.add(2);
        Iterator<Integer> itr = li.iterator();
        while(itr.hasNext()){
            if(itr.next() == index){
                itr.remove();
            }
        }

        char[] och = new char[3];
        och[index] = ch;

        if(ch == 'R')
            rf = true;
        else if(ch == 'B')
            bf = true;
        else if(ch == 'G')
            gf = true;

        int smax = 0;
        char sch = 'z';
        int sindex = -1;
        itr = li.iterator();
        while(itr.hasNext()) {
            int i = itr.next();
            if(rc[i] > smax && och[index] != 'R'){
                smax = rc[i];
                sch = 'R';
                sindex = i;
            }
            if(bc[i] > smax &&  och[index] != 'B'){
                smax = bc[i];
                sch = 'B';
                sindex = i;
            }
            if(gc[i] > smax &&  och[index] != 'G'){
                smax = gc[i];
                sch = 'G';
                sindex = i;
            }
        }

        itr = li.iterator();
        while(itr.hasNext()){
            if(itr.next() == sindex){
                itr.remove();
            }
        }

        och[sindex] = sch;

        if(sch == 'R')
            rf = true;
        else if(sch == 'B')
            bf = true;
        else if(sch == 'G')
            gf = true;

        int finalindex = li.get(0);
        char finalChar = 'z';
        if(rf == false)
            finalChar = 'R';
        if(gf == false)
            finalChar = 'G';
        if(bf == false)
            finalChar = 'B';
        och[finalindex] = finalChar;

        int count = 0;
        for(int i = 0; i < n; i++){
            if(input[i] != och[i%3])
                count += 1;
        }
        out.println(count);
        for(int i = 0; i < n; i++){
            out.print(och[i%3]);
        }
    }
}