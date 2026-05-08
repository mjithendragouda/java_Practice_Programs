import java.util.Scanner;

class primeNumber {
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        int count = 0;
        System.out.println("The prime numbers between "+low+" and "+high+" are: ");

        while (low <= high){
            for(int i=2; i<=Math.sqrt(low); i++){
                if(low%i==0){
                    count++;
                    break;
                }
            }            
            if(count==0){
                System.out.println(low);
            }
            low++;
            count =0;
        }
        scn.close();
    }
}