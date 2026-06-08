import java.util.Scanner;
import java.util.Stack;

public class NGETR {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(0);
        for(int i = 1; i<n; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) { 
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        for(int val : nge){
            System.out.print(val+" ");
        }
        sc.close();
    }
}
