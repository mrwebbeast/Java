package task11;

import java.util.Scanner;

public class Solution {

    static public void prallelogram() {
        int b;
        int h;
        boolean flag;

        Scanner scan = new Scanner(System.in);

        b = scan.nextInt();
        h = scan.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.printf("java.lang.Exception: Breadth and height must be positive");
            flag = false;

        } else {

            flag = true;
        }
        if (flag) {
            System.out.printf("%d%n", b * h);
        }

        scan.close();

    }

    public static void main(String[] args) {

        prallelogram();
    }
}
