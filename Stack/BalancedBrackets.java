import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a compund Expression: ");
        String str = sc.nextLine();
        boolean balanced = true;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!=')' && ch!='}' && ch!=']' ){
                if(ch=='('||ch=='['||ch=='{'){
                    st.push(ch);
                }
            }
            else if(ch == ')'){
                if( st.isEmpty()||st.peek() !='('){
                    balanced = false;
                    break;
                }
                st.pop();
            }
            else if(ch == ']'){
                if(st.isEmpty()|| st.peek() !='['){
                    balanced = false;
                    break;
                }
                st.pop();
            }
            else if(ch == '}'){
                if(st.isEmpty()||st.peek()!='{'){
                    balanced = false;
                    break;
                }
                st.pop();
            }
        }
        System.out.println(st);
        if(!st.isEmpty()){
            balanced = false;
        }
        System.err.println(balanced);
        sc.close();
    }
}
