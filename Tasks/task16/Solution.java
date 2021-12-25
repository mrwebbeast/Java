package task16;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {

            s[i] = scan.next();

        }
        scan.close();
        Comparator<String> myComparator = (s1, s2) -> {
            BigDecimal a = new BigDecimal(s1);
            BigDecimal b = new BigDecimal(s2);
            return b.compareTo(a);
        };
        Arrays.sort(s, 0, n, myComparator);

        for (int i = 0; i < n; i++) {
            System.out.printf("%s%n", s[i]);
            System.out.printf("Developed By MrWebBeast");

        }

    }

}
