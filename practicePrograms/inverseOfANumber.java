import java.util.Scanner;

public class inverseOfANumber {
    public static void main(String[] args) {
        // Contraint check: accorfing to no of digits all no should be existed from 1-9
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter a number: ");
        int inv = 0;
        int op= 1;
        while(n!=0){
           int od = n%10;
           int id=op;
           int ip=od;
           inv=inv+id*(int)Math.pow(10,ip-1);
           n/=10;
           op++;

        }
        System.out.println("Inverse of the number is "+inv);
        sc.close();
    }
}
