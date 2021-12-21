package task8;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                int powA = (int) Math.pow(2, j);
                a = a + (powA * b);
                System.out.printf("%d ", a);
            }
            System.out.println("");
        }
        scan.close();
    }
}
