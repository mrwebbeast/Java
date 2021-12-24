import java.util.Scanner;

public class MrWebBeast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println(i + 4);
        System.out.println(d + d);
        System.out.printf("Your String is %s", s);
        scan.close();
    }

}
