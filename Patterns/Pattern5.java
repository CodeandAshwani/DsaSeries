import java.util.Scanner;

public class Pattern5 {
    static void print5(int n){
        for (int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of you times you want the pattern to be printed: ");
        int t=sc.nextInt();
        for(int i=1; i<=t;i++) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            print5(n);
        }
    }
}


