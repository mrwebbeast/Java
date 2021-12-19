package task3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of Items");
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int average = 0;
        for (int i = 0; i < n; i++) {
            average += a[i];
        }
        average /= n;
        System.out.println("Avarage is " + average);

    }

}
