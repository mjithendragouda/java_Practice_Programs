import java.util.Scanner;

public class SumOfTwoArraysIndividualDigit {
    public static void insertion(int[] arr, String ArrayName, Scanner sc){
        System.out.print("Enter the "+ArrayName+" elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void display(int []arr, String ArrayName){
        System.out.print(ArrayName+" = ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void SumOfArrays(int[] arr1, int[] arr2){
        int max=arr1.length;
        int [] b;
        int [] s;
        int diff;
        if(arr2.length>max){
            max = arr2.length;
            b = arr2;
            s = arr1;
            diff = max-arr1.length;
        }else{
            diff = max - arr2.length;
            b = arr1;
            s = arr2;
        }
        System.out.println("           ----------------");
        System.out.print("sum  = ");
        int sum = 0; int j = 0;
        for(int i=0; i<max; i++){
            if(diff>0){
                sum = b[i];
                System.out.print(sum+" ");
                diff--;
            }else{
                sum = b[i]+s[j];
                System.out.print(sum+" ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first array size: ");
        int n1 = sc.nextInt();
        System.out.println("Enter another array size: ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        insertion(arr1, "Array 1 ", sc);
        insertion(arr2, "Array 2 ", sc);
        display(arr1);
        display(arr2);
        SumOfArrays(arr1, arr2);
        sc.close();        
    }
}