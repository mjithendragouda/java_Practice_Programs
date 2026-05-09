import java.util.Scanner;

public class digitsInANumber {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number:");
        long n = scan.nextInt();
        long num = n;
        int count =0;
        long q;
        System.out.println("digits are:");
        while (num>0){
            count++;
            num/=10;
        }
        num=n;
        long div = (int)(Math.pow(10,(count-1)));
        while(div>0){
            q=num/div;
            System.out.println(q);
            num%=div;
            div/=10;
        }
        scan.close();
    }
}
