import java.util.Scanner;

public class Pattern8 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n= sc.nextInt();
        for(int i=0;i<n;i++) {
            for (int j=0; j<i;j++) {
                System.out.print(" ");
        } for (int j=0; j<2*n-1 -2*i;j++) {
            System.out.print("*");
        }
            for (int j=0; j<i;j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
