package task15;

import java.math.BigInteger;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger add = a.add(b);
        BigInteger multi = a.multiply(b);
        scan.close();

        System.out.println(add);
        System.out.println(multi);

    }

}
