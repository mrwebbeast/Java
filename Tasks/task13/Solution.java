package task13;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mm = scan.nextInt();
        int dd = scan.nextInt();
        int yy = scan.nextInt();
        System.out.println(getDay(mm, dd, yy));
        scan.close();
    }

    public static String getDay(int mm, int dd, int yy) {
        LocalDate dayIs = LocalDate.of(yy, mm, dd);
        return dayIs.getDayOfWeek().name();
    }
}
