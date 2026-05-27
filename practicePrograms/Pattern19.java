import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int con = n / 2 + 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j <= con || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i < con) {
                    if (j == con || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i == con) {
                    System.out.print("*\t");

                } else if (i > con && i < n) {
                    if(j==1 ||j==con){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                }else{
                    if(j==1 || j>=con){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }

            System.out.println("\n");
        }
        sc.close();
    }

}
