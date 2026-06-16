import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlapingIntervals {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i<n; i++){
            String line = br.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[1]);

        }
        mergeOverlapingIntervals(arr);
    }
    public static void mergeOverlapingIntervals(int[][] arr){
        // Merge Overlapping intervals and print in increasing order
        Pair[] pairs = new Pair[arr.length];
        System.out.println("Unsorted Array: ");
        for(int i = 0; i < arr.length; i++){
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
            System.out.println(pairs[i].st+" "+ pairs[i].et);
            
        }
        System.out.println();
        
        Arrays.sort(pairs);
        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            
            System.out.println(pairs[i].st+" "+ pairs[i].et);
            
        }
        
       
        Stack<Pair> stk = new Stack<>();
        
        for(int i  = 0; i < pairs.length; i++){
            if(i == 0){
                stk.push(pairs[i]);
            }else{
                Pair top = stk.peek();
                if(pairs[i].st > top.et){
                    stk.push(pairs[i]);
                }else{
                    top.et = Math.max(pairs[i].et, top.et);

                }
            }
        }
        Stack<Pair> rs = new Stack<>();
        while(stk.size()>0){
            rs.push(stk.pop());
        }
        System.out.println("Merge overlaping intervals in increasing order:");
        while(rs.size()>0){
            Pair p = rs.pop();
            System.out.println(p.st+" "+p.et);
        }

    }
    public static class Pair implements Comparable<Pair>{
        int st;
        int et;
        Pair(int st, int et){
            this.et = et;
            this.st = st;
        }
        //This > other return +ve
        //This == other return  0
        //this < other return -ve
        public int compareTo(Pair others){
            if(this.st != others.st){
                return this.st-others.st;
            }else {
                return this.et - others.et;
            }
        }
    }
}