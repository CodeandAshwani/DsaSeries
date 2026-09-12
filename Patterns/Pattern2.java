
import java.util.Scanner;

public class Pattern2 {
    static void print1(int n){
        for(int i=0; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
   public static void main() {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of you times you want the pattern to be printed: ");
        int t=sc.nextInt();
        for(int i=1; i<=t;i++) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            print1(n);
        }


    }
}
