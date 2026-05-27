import java.util.Scanner;

public class DigitFreq {
public static void display(long x, int y, int z){
    System.out.println("Frquency of the digit "+y+" in number "+x+" is: "+z);
}
public static int frequency(long x, int y){
    int count=0;
    while (x>0){
        int r =(int) x%10;
        if(r==y){
            count ++;
        }
        x/=10;
    }

    return count;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int digit = sc.nextInt();
        int freq = frequency(n, digit);
        display(n, digit, freq);
        sc.close();
    }
}
