import java.util.Scanner;

public class SumOfTwoArrays {
    public static int[] sum(int[] arr1, int[] arr2) {
        int a1 = arr1.length - 1,
            a2 = arr2.length - 1,
            carry = 0;
                
        int[] sumArr = new int[(a1 > a2 ? a1 : a2) + 2];
        int s = sumArr.length - 1;
        while (s >= 0) {
            int d = carry;
            if (a1 >= 0) {
                d = d + arr1[a1];
            }
            if (a2 >= 0) {
                d = d + arr2[a2];
            }
            carry = d / 10;
            d = d % 10;

            sumArr[s] = d;

            a1--;
            a2--;
            s--;
        }
         
        if(carry != 0){
            
            sumArr[0]=carry;
        }
        
        return sumArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first array size: ");
        int n1 = sc.nextInt();
        System.out.print("Enter another array size: ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        SumOfTwoArraysIndividualDigit.insertion(arr1, "Array 1 " ,sc);
        SumOfTwoArraysIndividualDigit.insertion(arr2, "Array 2 ", sc);
        SumOfTwoArraysIndividualDigit.display(arr1, "Array 1 ");
        SumOfTwoArraysIndividualDigit.display(arr2, "Array 2 ");
        SumOfTwoArraysIndividualDigit.display(sum(arr1, arr2), "Summed Array ");
        sc.close();
    }
}
