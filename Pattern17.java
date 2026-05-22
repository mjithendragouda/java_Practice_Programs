import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        int con = n / 2 + 1;
        int k = con;
        for (int i = 1; i <= n; i++) {

            if(i==con){
                for(int j=1; j<=n; j++){
                    System.out.print("*\t");
                }
            }
                                
            else {
                for (int j = 1; j <= k;j++) {

                    if (j >= con ) {        
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }                  
                }
            }
            System.out.println();
            if(i<con){
                k++;
            }else {
                k--;
            }
            
        }
        sc.close();
    }
}
