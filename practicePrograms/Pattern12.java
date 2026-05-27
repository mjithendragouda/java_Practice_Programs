import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int val = 0;
        int temp = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(val + "\t");
                sum = val + temp;
                val = temp;
                temp = sum;
            }
            System.out.println();
        }
        sc.close();
    }
}
