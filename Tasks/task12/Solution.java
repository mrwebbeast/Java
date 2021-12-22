package task12;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= -100 && n <= 100) {
            System.out.print("Good job");
        } else {
            System.out.print("Wrong answer");
        }
        scan.close();

    }
}
