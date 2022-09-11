package task21;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String isPelendrom = isPelendrom(str) == true ? "Yes" : "No";
        System.out.println(isPelendrom);
        scan.close();
    }

    public static boolean isPelendrom(String str) {
        String reverse = "";
        boolean isPelendrom = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            isPelendrom = true;
        }
        return isPelendrom;
    };
}
