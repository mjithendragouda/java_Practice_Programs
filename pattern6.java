import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println();
        int sp = 1;
        int st = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            
            //   System.out.println(st+"\t"+sp+"\t"+st);
            
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }

                if (i <= n / 2) {
                    sp += 2;
                    st--;
                } else {
                    sp -= 2;
                    st++;
                }
                System.out.println();
            
               
            }
             
            
            sc.close();
            
        
    }
}