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

        int[] ls = new int[a.length];

        int maxArea = 0;
        for(int i=0; i<a.length; i++){
            int width = rs[i] - ls[i] - 1;
            int area = a[i] * width;
            if(area>maxArea){
                maxArea = area;
            }
        }
    }
}
