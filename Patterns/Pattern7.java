import java.util.Scanner;

public class Pattern7 {
    static void print7(int n) {
        for(int i=0; i<n;i++){
            //space
            for (int j=0; j<n-i-1;j++){
                System.out.print(" ");
                //star
            } for(int j=0;j<2*i+1;j++){
                System.out.print("*");
                //space
            } for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=1;i<=t;i++){
            int n= sc.nextInt();
            print7(n);
        }

    }
}