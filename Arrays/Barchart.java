import java.util.Scanner;

public class Barchart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter values of the array:");
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(max <= arr[i]){
                max = arr[i];
            }
        }

        for(int i=max; i>0; i--){
            for(int j=0; j<arr.length; j++){
               
                if(i<=arr[j]){
                    System.out.print("***\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}