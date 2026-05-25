import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        int mid = n/2+1;
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= mid) {
                    if (j == 1 || j == n || j == k || j == i) {
                        System.out.print("*\t");
                    } else
                        System.out.print("\t");
                } else {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else
                        System.out.print("\t");
                }
                //Better Version
                //  if (j == 1 || j == n) {

                //     System.out.print("* ");

                // } else if (i >= mid && (i == j || i + j == n + 1)) {

                //     System.out.print("* ");

                // } else {

                //     System.out.print("  ");
                // }
            }
            System.out.println();
            k--; //not requred for bettern version code
        }
        sc.close();
    }
}
