import java.util.Scanner;

public class DecimalToBaseCon {

    public static int getValueInBase(int x, int y) {
        int rv = 0;
        int p = 1;
        while (x > 0) {
            int digit = x % y;
            x = x / y;
            rv = rv + digit * p;
            p = p * 10;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and converting base value: ");
        int n = sc.nextInt();
        int b = sc.nextInt();
        int bv = getValueInBase(n, b);
        System.out.println(bv);
        sc.close();
    }
}