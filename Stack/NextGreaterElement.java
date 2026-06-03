import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                newArr[i] = -1;
            } else {
                int j = i + 1;
                while (arr[i] >= arr[j] && j < n) {
                    j++; // at last j will become n even j<n in the condition Bcoz j++
                }

                if (j < n) { // here since j == n this condition will failed
                    newArr[i] = (arr[j]); // if greater number is not found until arr[n-1]th element
                } else {
                    newArr[i] = -1;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Next greater element for " + arr[i] + " is " + newArr[i]);
        }
        sc.close();

    }
}
