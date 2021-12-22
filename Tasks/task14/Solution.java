package task14;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
