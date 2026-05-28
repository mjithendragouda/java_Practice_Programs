import java.util.Scanner;

public class AnyBaseMultiplicataion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number and the base: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int b = sc.nextInt();
        int ans = getProduct(num1, num2, b);
        System.out.println("Result = " + ans);
        sc.close();
    }

    public static int getProduct(int n1, int n2, int b) {
        int product = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2%10;
            int tempProd = getSingleDigitProduct(n1, d2, b);          
            product = AnyBaseAddition.getSum(product, tempProd*p, b);
            n2 = n2 / 10;
            p = p * 10;
        }
        return product;
    }

    public static int getSingleDigitProduct(int n1, int d2, int b){
        int carry = 0;
        int prod = 0;
        int p = 1;
        while(n1 > 0 || carry > 0){
            int d1 = n1%10;
            int val = d1 * d2 + carry;
            int digit = val % b;
            carry = val / b;
            prod = prod + digit * p;
            p = p * 10;
            n1 = n1 /10;
        }
        return prod;
    }
}
