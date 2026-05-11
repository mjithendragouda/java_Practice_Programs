import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();            
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
