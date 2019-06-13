package CF566DIV2;

import java.util.Scanner;

public class SolutionB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++) {
            arr[i] = in.next().toCharArray();
        }
        boolean found = false;
        for (int i = 1; i < r - 1; i++) {
            if(found)
                break;
            for (int j = 1; j < c - 1; j++) {
                if (arr[i][j] == '*') {
                    if (arr[i + 1][j] == '*' && arr[i][j + 1] == '*' && arr[i][j - 1] == '*' && arr[i - 1][j] == '*') {
                        arr[i][j] = '.';
                        found = true;
                        int k = i + 1;
                        while(k < r) {
                            if(arr[k][j] == '*')
                                arr[k][j] = '.';
                            else {
                                break;
                            }
                            k++;
                        }

                        k = i - 1;
                        while(k >= 0) {
                            if(arr[k][j] == '*')
                                arr[k][j] = '.';
                            else {
                                break;
                            }
                            k--;
                        }

                        k = j + 1;
                        while(k < c) {
                            if(arr[i][k] == '*')
                                arr[i][k] = '.';
                            else {
                                break;
                            }
                            k++;
                        }

                        k = j - 1;
                        while(k >= 0) {
                            if(arr[i][k] == '*')
                                arr[i][k] = '.';
                            else {
                                break;
                            }
                            k--;
                        }

                        break;
                    }
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j] == '*') {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if(found)
            System.out.println("YES");
        else
            System.out.println("NO");

        return;

    }
}