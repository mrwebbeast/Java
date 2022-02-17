import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number for Pattern Size : ");
        int size = scan.nextInt();
        scan.close();
        pattern1(size);
        pattern2(size);
        pattern3(size);
        pattern4(size);
        pattern5(size);
        pattern6(size);
        pattern7(size);
        pattern8(size);

    }
//you can use this method to print the pattern
    public static void pattern1(int n) {
        System.out.println("1) Pattern 1 (Box) is ");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
//you can run this method to print the pattern
    public static void pattern2(int n) {
        System.out.println("2) Pattern 2 (Right Side Piramide) is ");
        System.out.println("");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern3(int n) {
        System.out.println("3) Pattern 3 (Left Side Box)is ");
        System.out.println("");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern4(int n) {
        System.out.println("4) Pattern 4 (Right Side Box)is ");
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern5(int n) {
        System.out.println("5) Pattern 5 (Left Side Piramide) is ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = n; j > n - i + 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

    public static void pattern6(int n) {
        System.out.println("6) Pattern 6 Chrimas Tree is ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = n; j > n - i + 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

    public static void pattern7(int n) {
        int number = 1;
        System.out.println("7) Pattern 7 Numebers Tree is ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = n; j > n - i + 1; j--) {
                System.out.print(number++ + "  ");
            }
            System.out.println("");

        }

    }

    public static void pattern8(int n) {
        System.out.println("8) Pattern 8 Tilt Peramide Tree is ");
        int row = 2 * n - 1;
        for (int i = 1; i <= row; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= row - i + 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println("");

        }

    }

}