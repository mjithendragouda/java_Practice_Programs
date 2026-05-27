import java.util.Scanner;

public class noOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number:");
        long n = scan.nextInt();
        int count =0;
        long num =n;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("No of digits in the number "+n+" is "+count);
        scan.close();
    }
}
