public class CustomStack {
    public static void main(String[] args) {
        CStack st = new CStack(5);
        st.size();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.size());

        st.pop();
        System.out.println(st.size());
        System.out.println(st.tos+" "+st.pop());
        System.out.println(st.size());
        st.display();
        System.out.println(st.pop());

    }
    
   
}

class CStack {
    int[] data;
    int tos;
    public CStack(int cap){
        data = new int[cap];
        tos = -1;
    }
    public int size(){
        return tos+1;
    }
    public void push(int val){
        if(tos == data.length-1){
            System.out.println("Stack overflow");
        }else{
            tos++;
            data[tos]=val;
        }
    }
    int pop(){
        if(tos ==-1){
            System.out.println("stack underflow");
            return -1;
        }else{
            int val = data[tos];
            tos--;
            return val;
        }
    }
    int top(){
        if(tos == -1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return data[tos];
        }
    }
    void display(){
        for(int i = tos; i>=0; i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    
}
