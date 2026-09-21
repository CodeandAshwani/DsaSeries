import java.util.Scanner;

public class Pattern6 {
    static void print6(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for (int i=1;i<=t;i++){
               int n= sc.nextInt();
               print6(n);
            }

    }
}
