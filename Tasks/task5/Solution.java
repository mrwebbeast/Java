package task5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }
        scan.close();
        long avarage = 0l;
        for (int i = 0; i < n; i++) {
            avarage += a[i];
        }
        System.out.println(avarage);

    }

}