import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("which number do you want to find in the array: ");
        int d = sc.nextInt();
        int index = findElement(arr, d);
        System.out.println(index);
        sc.close();
    }
    public static int findElement(int[] arr, int d){
        int index = -1;
        for(int i = 0; i < arr.length; i++ ){
            if(d == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
