import java.util.Scanner;

public class DiffOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first array size: ");
        int n1 = sc.nextInt();
        System.out.print("Enter another array size: ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        SumOfTwoArraysIndividualDigit.insertion(arr1, "Array 1 ", sc);
        SumOfTwoArraysIndividualDigit.insertion(arr2, "Array 2 ", sc);
        SumOfTwoArraysIndividualDigit.display(arr1, "Array 1 ");
        SumOfTwoArraysIndividualDigit.display(arr2, "Array 2 ");
        difference(arr1, arr2);
        sc.close();
    }

    public static boolean isGreater(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i])
                return true;
            if (a[i] < b[i])
                return false;
        }
        return true;
    }

    public static void difference(int[] arr1, int[] arr2) {
        int[] difference = new int[(Math.max(arr1.length, arr2.length))];
        int[] b;
        int[] s;
        int carry = 0;
        if (arr1.length > arr2.length) {
            b = arr1;
            s = arr2;
        } else if (arr1.length == arr2.length) {
            if (isGreater(arr1, arr2)) {
                b = arr1;
                s = arr2;
            } else {
                b = arr2;
                s = arr1;
            }
        } else {
            b = arr2;
            s = arr1;
        }
        int bl = b.length - 1;
        int sl = s.length - 1;

        for (int i = difference.length - 1; i >= 0; i--) {
            int sd = (sl >= 0) ? s[sl] : 0;
            int d = b[bl] - carry;
            if (d < sd) {
                d = d + 10;
                carry = 1;
            } else {
                carry = 0;
            }
            difference[i] = d - sd;
            bl--;
            sl--;
        }
        int start = 0;
        while (start < difference.length - 1 && difference[start] == 0) {
            start++;
        }
        System.out.print("Difference = ");
        for (int index = start; index < difference.length; index++) {
            System.out.print(difference[index] + " ");
        }
    }
}
