import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class PrefixEvaluation {
    
        public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<String> evl = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> infix = new Stack<>();

        for(int i = exp.length()-1; i >= 0; i--){
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <= '9' || 
            ch >= 'a' && ch <= 'z' || 
            ch >= 'A'&& ch <= 'Z')
            {
                postfix.push(ch+"");
                infix.push(ch+"");
                evl.push(ch+"");

            }else if(ch == '+' || ch == '-'|| ch == '*' || ch == '/'){

                String prev1 = postfix.pop();
                String prev2 = postfix.pop();
                String val = prev1+prev2+ch;
                postfix.push(val);


                String inv1 = infix.pop();
                String inv2 = infix.pop();
                String inval = "("+inv1+" "+ch+" "+inv2+")";
                infix.push(inval);


                String ev1 = evl.pop();
                String ev2 = evl.pop();
                boolean isNumeric2 = ev2.matches("-?\\d+");
                boolean isNumeric1 = ev1.matches("-?\\d+");
                int v2 =0, v1=0;
                if(isNumeric2 && isNumeric1){
                    v2 = Integer.parseInt(ev2);
                    v1 = Integer.parseInt(ev1);
                    int ans = operation(v1, v2, ch);
                    evl.push(ans+"");
                }else {
                    String ans = ev1+ch+ev2;
                    evl.push(ans);
                }
            }

        }
        System.out.println(postfix.peek());
        System.out.println(infix.peek());
        System.out.println(evl.peek());    
    }

    public static int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1 + v2;
        }else if(op == '-'){
            return v1 - v2;
        }else if(op == '*'){
            return v1 * v2;
        }else if(op == '/'){
            return v1 / v2;
        }else return 0;
    }
}
