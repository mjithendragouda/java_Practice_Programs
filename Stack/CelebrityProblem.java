import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//Celebrity rule is everyone must know the celebrity
//but celebrity must not know anyone
//array elements must be 0 or 1
//0 represents don't know
//1 represents knows 

public class CelebrityProblem {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine()); // only one value beacuse two D array has to be equal sized.
        
        int[][] matrix = new int[r][r];
        for(int i = 0; i<r; i++){
            String line = br.readLine();
            for(int j=0; j<r; j++){
                matrix[i][j] = line.charAt(j) - '0';
                
            }
        }
        findCelebrity(matrix);
    }
    public static void findCelebrity(int arr[][]){
        
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            st.push(i);
        }
        while(st.size()>1){
            int e1 = st.pop();
            int e2 = st.pop();
            if(arr[e1][e2] == 1){ //if element at e1th row at e2 column is 1
                st.push(e2);   //-it means e1 knows e2, so e1 is not a celebrity, hence push e2
            }else st.push(e1); 
        }
        int pot = st.pop();
        for(int i =0; i<arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i]==1){
                    //if i doesn't know potential then pot is not a celebrity
                    // or pot knows i even then also potential is not a celebrity
                    System.out.println("none");
                    return; // then return out of the program printing none is celebririty
                }
            }
        }
        System.out.println(pot);
    }
}
