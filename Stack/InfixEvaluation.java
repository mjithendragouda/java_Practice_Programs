import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i=0; i<exp.length(); i++){  
            char ch = exp.charAt(i);
            if(ch =='('){
                operator.push(ch);
            }else if(Character.isDigit(ch)){
                operands.push(ch - '0'); //convert into number
            }else if(ch == ')'){
                while(operator.peek() != '('){
                    int v2 = operands.pop();
                    char op = operator.pop();
                    int v1 = operands.pop();
                    operands.push(operation(v1, v2, op));

                }
                operator.pop();

            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                //ch is allowing to make the operation of higher precedence operators first
                while (operator.size() > 0 && operator.peek() != '('
                    && precedence(ch) <= precedence(operator.peek())) {

                    int v2 = operands.pop();
                    char op = operator.pop();
                    int v1 = operands.pop();
                    operands.push(operation(v1, v2, op));

                }
                //ch will push itself
                operator.push(ch);
            }
        }
        while(operator.size() != 0){
            int v2 = operands.pop();
            char op = operator.pop();
            int v1 = operands.pop();
            operands.push(operation(v1, v2, op));

        }
        System.out.println(operands.peek());

    }
    public static int precedence(char operartor){
        if(operartor =='+'){
            return 1;
        }else if(operartor == '-'){
            return 1;
        }else if(operartor == '*'){
            return 2;
        }else{            
            return 2;
        }
    }

    public static int operation(int v1, int v2, char operartor){
        if(operartor =='+'){
            return v1 + v2;
        }else if(operartor == '-'){
            return v1 - v2;
        }else if(operartor == '*'){
            return v1 * v2;
        }else{
            return v1 / v2;
        }
    }

}