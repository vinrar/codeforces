package CF535DIV3;

import java.util.*;
import java.io.PrintWriter;

public class BDivisorsOfTwoIntegers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
//        int n = in.nextInt();
//
//        List<Integer> arr = new ArrayList<Integer>();
//        int secondMax = 1;
//        for (int i = 0; i < n; i++) {
//            arr.add(in.nextInt());
//        }
//
//        Collections.sort(arr);
//        int max = arr.get(n - 1);
//
//        for (int i = n - 2; i >= 0; i--) {
////            out.println("i: " + i + " arr[i]:" + arr.get(i) + "arr[i+1]:" +arr.get(i+1));
////            out.println(arr.get(i) == arr.get(i+1));
//            if (max % arr.get(i) != 0) {
//                secondMax = arr.get(i);
//                break;
//            } else if (arr.get(i).equals(arr.get(i + 1))) {
//                secondMax = arr.get(i);
//                break;
//            }
//        }
//
//        out.println(max + " " + secondMax);

        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        boolean vis[]=new boolean[n];
        int i=0,j=n-1;
        for(int k=1;k<=(int)Math.sqrt(arr[n-1]);k++)
        {
            if(arr[n-1]%k==0)
            {
                while(arr[i]!=k)
                {
                    i++;
                }
                vis[i]=true;
                if(k!=(arr[n-1]/k))
                {
                    while(arr[j]!=(arr[n-1]/k))
                    {
                        j--;
                    }
                    vis[j]=true;
                }
            }
        }
        for(int k=n-1;k>=0;k--)
        {
            if(!vis[k])
            {
                out.println(arr[n-1]+" "+arr[k]);
                break;
            }
        }
    }
}