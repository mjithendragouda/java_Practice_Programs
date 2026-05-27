import java.util.Scanner;

class pythagorianTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (max == a) {
            boolean flag = ((b * b) + (c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((a * a) + (c * c) == (b * b));
            System.out.println(flag);
        } else {
            boolean flag = ((a * a) + (b * b) == (c * c));
            System.out.println(flag);
        }

        // if (c > a) {
        // if (c > b) {
        // boolean flag = ((a * a) + (b * b) == (c * c));
        // System.out.println(flag);
        // } else {
        // boolean flag = ((a * a) + (c * c) == (b * b));
        // System.out.println(flag);
        // }
        // } else if (a > b) {
        // boolean flag = ((b * b) + (c * c) == (a * a));
        // System.out.println(flag);
        // } else {
        // boolean flag = ((a * a) + (c * c) == (b * b));
        // System.out.println(flag);
        // }
        sc.close();
    }

}
