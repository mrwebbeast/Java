package task6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String a = scan.next();
            int intA = scan.nextInt();
            System.out.printf("%-15s%03d%n", a, intA);
        }
        scan.close();
        System.out.print("================================");

    }
}