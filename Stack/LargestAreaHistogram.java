import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a =  new int[n];
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] rs = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(a.length-1);
        rs[a.length-1] = a.length;
        for(int i = a.length-1; i>=0; i--){
            while (st.size()>0 && a[i]< a[st.peek()]) {
                st.pop();
            }
            if(st.size() == 0){
                rs[i] = a.length;
            }else {
                rs[i] = st.peek();
            }
            st.push(i);
        }
        int[] ls = new int[a.length];
        st = new Stack<>();
        st.push(0);
        ls[0] = -1;
        for(int i = 1; i<a.length; i++){
            while(st.size()>0 && a[i] < a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ls[i] = -1;
            }else{
                ls[i] = st.peek();
            }
            st.push(i);
        }


        int maxArea = 0;
        for(int i=0; i<a.length; i++){
            int width = rs[i] - ls[i] - 1;
            int area = a[i] * width;
            System.out.println(a[i]+" Area is "+area);
            if(area>maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}
