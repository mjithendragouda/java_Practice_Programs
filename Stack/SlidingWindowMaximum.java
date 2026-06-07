import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] array = 
        {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
        int k = 4;
        int start = 0;
        
        Stack<Integer> st;
        for(int i = 0; i<array.length && start <= array.length-k ; i++){
            
            st = getStackWindow(array, start, start+k);
            int max = maxOfStack(st);
            display(st, max);
            start++;          


        }

        
    }

    public static int maxOfStack(Stack<Integer> s){
        int max = s.get(0);
        for(int val : s){
            if(val > max){
                max = val;
            }
        }
        return max;
    }

    public static Stack<Integer> getStackWindow(int[] arr, int start, int end){
        Stack<Integer> st = new Stack<>();
        for(int i=start; i<end; i++){
            st.push(arr[i]);
        }
        return st;
    }
    public static void display(Stack<Integer> st, int maxOfStack){
        System.out.println(st+" - "+maxOfStack);
    }
}
