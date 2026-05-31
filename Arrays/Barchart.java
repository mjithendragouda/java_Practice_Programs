import java.util.Scanner;

public class Barchart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter values of the array:");
        arr[0]=sc.nextInt();
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i=max; i>0; i--){
            for(int j=0; j<arr.length; j++){
               
                if(arr[j]>=i){
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