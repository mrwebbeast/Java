package task9;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            try {
                long val = scan.nextLong();
                System.out.println(val + " can be fitted in:");
                if (val >= -128 && val <= 127) {
                    System.out.println("* byte");
                }
                if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (val >= Long.MIN_VALUE && val <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");

            }
        }
        scan.close();
    }
}
