import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long n = num;
        int rev = 0;
        int digit;
        while (n > 0) {
            digit = (int) n % 10;       //getting digit
            rev = rev * 10 + digit;     //appending digit 
            n /= 10;                    //removing last digit
        }

        sc.close();
    }
}
