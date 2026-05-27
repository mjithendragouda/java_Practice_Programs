import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("FibonacciSeries till: ");
        int n = scn.nextInt();
        int first = 0;
        int second = 1;
        int sum=0;
        System.out.println(first);
        while (sum<=n){
            
            sum=first+second;
            first=second;
            second=sum;
            System.out.println(first);
        }
        scn.close();
    }
    

}