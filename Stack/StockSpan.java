import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i]= Integer.parseInt(br.readLine());
        }
        int [] b =  {1, 2, 6, 8, 9, 5, 4, 8, 3, 4};
      
        int[] span = solve(b);
        display(span);
    }
    public static int[] solve(int[] arr){
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        for(int i =1; i<arr.length; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()] ){
                st.pop();
            }
            if(st.size()==0){
                span[i] = i+1;
            }else{
                span[i] = 1 - st.peek();
            }
            st.push(i);
        }
        return span;
    } 

    public static void display(int[] b){
        StringBuilder sb = new StringBuilder();
        for(int val : b){
            sb.append(val+" ");
        }
         System.out.println(sb);
         
    }
}
