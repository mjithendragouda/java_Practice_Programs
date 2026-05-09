import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long n = num;
        int r;
        while(n>0){
            r= (int)n%10;
            System.out.println(r);
            n/=10;
        }
    }
}
