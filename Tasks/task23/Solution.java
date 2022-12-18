package task23;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hi");
        int min = 0;
        int max = 5;

        for (int i = min; i <= max; i++) {

            for (int j = max; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
