import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sp = 2*n-3;    //space count pattern will be different for every n's.
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(j+"\t");
            }
            for(int j=0; j<sp; j++){
                System.out.print("\t");
            }
            int start = (i==n)?i-1:i;
            for(int j=start; j>=1; j--){
                System.out.print(j+"\t");
            }
            sp-=2;
            System.out.println();
        }
        sc.close();
    }
}
