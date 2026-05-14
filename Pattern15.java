import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n / 2;
        int st = 1;
        int val = 1;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("\t");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("*\t");
        //     }           

        //     if (i <= n / 2) {
        //         sp--;
        //         st += 2;
        //     } else {
        //         sp++;
        //         st -= 2;
        //     }

        //     System.out.println();
        // }
        // System.out.println();
        // int sp1=n/2;
        // int st1=1;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=sp1; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1; j<=st1; j++){
        //         System.out.print("1\t");
        //     }
        //     if(i<=n/2){
        //         sp1--;
        //         st1+=2;
        //     }else {
        //         sp1++;
        //         st1-=2;
        //     }
        //     System.out.println();
        // }
        // int val=1;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=sp; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1; j<=st; j++){
        //         System.out.print(val+"\t");
        //         val++;
        //     }
        //     if(i<=n/2){
        //         sp--;
        //         st+=2;
        //     }else {
        //         sp++;
        //         st-=2;
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=sp; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1; j<=st; j++){
        //         System.out.print(i+"\t");
        //     }
        //     if(i<=n/2){
        //         sp--;
        //         st+=2;
        //     }else {
        //         sp++;
        //         st-=2;
        //     }
        //     System.out.println();
        // }
        

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=sp; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1; j<=st; j++){
              
        //         System.out.print(val+"\t");                    
            
        //     }
        //     if(i<=n/2){
        //         sp--;
        //         st+=2;
        //         val++;
        //     }else{
        //         sp++;
        //         st-=2;
        //         val--;
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=sp; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1; j<=st; j++){
        //         System.out.print(val+"\t");
        //         val++;
        //     }

        //     if(i<=n/2){
        //         sp--;
        //         st+=2;
        //         val=i+1;
        //     }else{
        //         sp++;
        //         st-=2;
        //         val=n-i;
                
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print(val+"\t");
                if(j<=st/2){
                    val++;
                }else {
                    val--;
                }

            }
            if(i<=n/2){
                sp--;
                st+=2;
                val=i+1;
            }else{
                sp++;
                st-=2;
                val=n-i;
            }
            System.out.println();
        }


        sc.close();
    }
}
