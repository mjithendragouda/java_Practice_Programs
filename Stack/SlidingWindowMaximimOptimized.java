import java.util.Stack;

public class SlidingWindowMaximimOptimized {
    public static void main(String[] args) {
       int[] array = 
        {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
        int k = 4;
        int[] nge = new int[array.length];
        Stack<Integer> st = new Stack<>();
        st.push(array.length-1);
        for (int i=array.length-2; i>=0; i--){
            //-a+
            while(st.size()>0 && array[i]>=array[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i]= array.length;
            }else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int j = 0;
        for(int i=0; i<array.length-k; i++){
            //finding maximum in a window, starting at i
            if(j<i){
                j=i;
            }
            while(nge[j]<i+k){
                j = nge[j];
            }
            System.out.println("Index "+i+" to "+"index "+(i+k)+" Maximum number is "+array[j]);
        }
    
    }
}
