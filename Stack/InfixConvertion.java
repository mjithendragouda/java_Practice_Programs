import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConvertion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<Character> operartors = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operartors.push(ch);
            } else if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == ')') {
                while (operartors.peek() != '(') {
                    char op = operartors.pop();
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String pv2 = postfix.pop();
                    String pv1 = postfix.pop();
                    prefix.push(op + v1 + v2);
                    postfix.push(pv1 + pv2 + op);
                }
                operartors.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operartors.size() > 0 && operartors.peek() != '('
                        && precedence(ch) <= precedence(operartors.peek())) {
                    char op = operartors.pop();
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    String pv2 = postfix.pop();
                    String pv1 = postfix.pop();
                    prefix.push(op + v1 + v2);
                    postfix.push(pv1 + pv2 + op);
                }
                operartors.push(ch);
            }

        }
        while (operartors.size() > 0) {
            char op = operartors.pop();
            String v2 = prefix.pop();
            String v1 = prefix.pop();
            String pv2 = postfix.pop();
            String pv1 = postfix.pop();
            prefix.push(op + v1 + v2);
            postfix.push(pv1 + pv2 + op);
        }
        System.out.println(prefix);
        System.out.println(postfix);

    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else
            return 0;
    }
}
