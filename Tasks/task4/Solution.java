package task4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("User 1");

        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("User 2");
        int b[] = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = scan.nextInt();
        }
        scan.close();
        int aP = 0;
        int bP = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aP += 1;
            } else if (a[i] == b[i]) {
                aP += 0;
            } else if (a[i] < b[i]) {
                bP += 1;
            }
        }

        System.out.println(aP + " " + bP);

    }

}
