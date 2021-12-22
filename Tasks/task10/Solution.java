package task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.printf("%d %s%n", i, scan.nextLine());
            i = i + 1;
        }
        scan.close();
    }
}
