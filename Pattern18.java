import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        int con = n / 2 + 1;
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || j == k) {
                    System.out.print("*\t");
                } else if (i > con && j < i && j > k) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            k--;
        }
        sc.close();
    }
}
