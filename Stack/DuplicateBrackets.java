import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write an expression: ");
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean duplicateBrackets = false;
        
        
        for(int i = 0 ;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(!st.isEmpty() && st.peek()=='('){
                   duplicateBrackets = true; 
                   System.out.println(duplicateBrackets);
                   sc.close();
                   return;  
                }
                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }else{
                st.push(ch);
            }

        }           
        System.out.println(duplicateBrackets);
        sc.close();
        
    }
}
