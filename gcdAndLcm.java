import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        

        //  if(f>=s){
        //     int rem = f%s;
        //     if(rem>0){
        //         System.out.print("GCD of "+f+" and "+s+" is "+rem);
        //     }
        //     else {
        //         System.out.print("GCD of "+f+" and "+s+" is "+s);
        //     }
        // }
        // else {
        //     int rem = s%f;
        //     if(rem>0){
        //         System.out.print("GCD of "+f+" and "+s+" is "+rem);
        //     }
        //     else {
        //         System.out.print("GCD of "+f+" and "+s+" is "+f);
        //     }
        // }                
        
        int num1 = f;
        int num2 = s;
        int rem;

        while (num1%num2!=0){
            rem=num1%num2;
            num1=num2;
            num2=rem;
        }        
        int GCD = num2;
        int LCM = (f*s)/GCD;  
        System.out.println("GCD of "+f+" and "+s+" is "+GCD);
        System.out.println("LCM of "+f+" and "+s+" is "+LCM);
        sc.close();
    }
}
