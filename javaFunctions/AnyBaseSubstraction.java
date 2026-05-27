import java.util.Scanner;

public class AnyBaseSubstraction {
    public static int getSub(int n1, int n2, int b){
        int substraction = 0;
        int d1, d2, diff = 0, cf = 0, p = 1;
        
        
        while (n1 > 0 || n2 > 0) {
            d1 = n1 % 10 - cf;
            d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            if(d1 < d2){
                diff = d1+b-d2;
                cf = 1;
            }else if(d1 == d2){
                diff = 0;
                cf = 0;
            }else{
                diff = d1 - d2;
                cf = 0;
            }
            substraction = substraction + diff * p;
            p *= 10;
        }

        return substraction;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and it's base: ");
        int num1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter another number and it's base: ");
        int num2 = sc.nextInt();
        int b2 = sc.nextInt();
        boolean negative = false;
        if(num2 > num1){
            int max = num2;
            num2 = num1;
            num1 = max;
            negative = true;
        }
        int result = getSub(num1, num2, b2);
        if(negative){
            System.out.println("Result = -"+result);
        }else{
            System.out.println("Result = "+result);
        }
        sc.close();
    }
}
