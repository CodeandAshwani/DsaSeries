import java.util.Scanner;

public class Pattern9 {
    static void Print9a(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 1 - 2 * i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void print9b(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
                //star
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
                //space
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            print9b(n);
            Print9a(n);
        }
    }
}
