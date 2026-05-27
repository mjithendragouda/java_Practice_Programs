import java.util.Scanner;

public class AnyBaseAddition {
    public static int getSum(int n1, int n2, int b) {
        int addition = 0;
        int d1, d2, p = 1, cf = 0, sum;
        while (n1 > 0 || n2 > 0 || cf > 0) {
            d1 = cf + (n1 % 10);
            d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int add = d1 + d2;
            if (add > b) {
                sum = add - b;
                cf = 1;
            } else {
                cf = 0;
                sum = add;
            }
            addition = addition + (sum * p);
            p *= 10;
        }

        return addition;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and its base: ");
        int num1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter another number and its base: ");
        int num2 = sc.nextInt();
        int b2 = sc.nextInt();
        int addition = getSum(num1, num2, b2);
        System.out.println(addition);
        sc.close();
    }
}
