import java.util.Scanner;

public class Pattern8 {
    static void Print8(int n) {
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
    static void main(){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=1;i<=t;i++){
            int n= sc.nextInt();
            Print8(n);

        }
    }
}
