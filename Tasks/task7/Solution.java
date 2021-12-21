package task7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.printf("%d x %d = %d%n", n, i, result);
        }
    }
}
