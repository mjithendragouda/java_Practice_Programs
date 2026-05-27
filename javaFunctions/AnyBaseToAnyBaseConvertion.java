import java.util.Scanner;

public class AnyBaseToAnyBaseConvertion {
    public static int decimalConvertion(int n, int b){
        int rv = 0;
        int num = n;
        int p = 1;
        while (num>0) {
            int dig = num % 10;
            num = num / 10;
            rv = rv + dig * p;
            p = p * b;
        }
        return rv;
    }
    public static int reqCon(int num, int b, int c){
        int rv = 0;
        int p = 1;
        int n = decimalConvertion(num, b);
        while(n>0){
            int dig = n % c;
            n = n / c;
            rv = rv + dig * p;
            p = p * 10;
        }

        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of any base and it's base(e.g., 110011 2): ");
        int n = sc.nextInt();
        int b = sc.nextInt(); 
        System.out.println();
        System.out.print("Enter the converting base: ");
        int c = sc.nextInt();
        int con = reqCon(n, b, c);
        System.out.println(con);
        sc.close();

    }
}
