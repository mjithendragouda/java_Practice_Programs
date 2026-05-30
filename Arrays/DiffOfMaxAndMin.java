import java.util.Scanner;

public class DiffOfMaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int diffrence = diffrence(arr);
        System.out.println("Diffrence of Max and Min val in the array is: "+diffrence);
        sc.close();
    }
    public static int diffrence(int[] arr){
        int diffrence = 0;
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]>=min){
                min = arr[i];
            }
            if(arr[i]>=max){
                max = arr[i];
            }
            
        }
        diffrence = max - min;
        return diffrence;
    }
}
