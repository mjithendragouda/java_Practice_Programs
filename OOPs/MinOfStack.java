import java.util.Stack;

public class MinOfStack {

    public static class MinStack{
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack(){
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size(){
            return allData.size();
        }

        void push(int val){
            allData.push(val);

            if(minData.size() == 0 || val <= minData.peek()){
                minData.push(val);
            }

        }
        int pop(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }else{
                int val = allData.pop();
                if(val == minData.peek()){
                    minData.pop();
                }
                return val;
            }

        }
        int top(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else return allData.peek();
        }
        int min(){
            if(minData.size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            return minData.peek();
        }


    }
    public static void main(String[] args) {
        MinStack st = new MinStack();
        System.out.println("Stack size: "+st.size());
        System.out.println("Stack pop: "+st.pop());
        System.out.println("Top of the Stack: "+st.top());
        System.out.println("Minmum value of Stack: "+st.min());

        st.push(10);
        st.push(20);
        st.push(9);
        st.push(30);
        st.push(5);
        st.push(2);
        st.push(40);
        st.push(35);

        System.out.println("Stack size: "+st.size());
        System.out.println("Top of the Stack: "+st.top());
        System.out.println("Stack pop: "+st.pop());
        System.out.println("Minmum value of Stack: "+st.min());

    }
}
