package task1;

//Competitive Programming by mrwebbeast
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n % 2 == 0 && 2 <= n && n <= 5) {
            System.out.print("Iam Not Weird");
        } else if (n % 2 == 0 && 6 <= n && n <= 20) {
            System.out.println("Iam Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Iam Not Weird");
        } else {
            System.out.println("Weird");
        }

    }
}
