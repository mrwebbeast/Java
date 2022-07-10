package task19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        scan.close();
        System.out.println(s.substring(input1, input2));
    }
}
