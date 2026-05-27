import java.util.Scanner;

public class OtherBaseToDecimalCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and its base: ");
        int n = sc.nextInt();
        int b = sc.nextInt();
        int con = decimalConvertion(n, b);
        System.out.println(con);
        sc.close();
    }

    public static int decimalConvertion(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv = rv + dig * p;
            p = p * b;
        }
        return rv;
    }
}
