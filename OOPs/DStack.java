public class DStack {   

    public static void main(String[] args) {
        DSTK st = new DSTK();
        System.out.println("Size: "+st.size());
        st.push(10);
        st.push(20);
        st.display();
        System.out.println(st.size());
    }

}

class DSTK{
int[] data;
    int tos;
    public DSTK(){
        data = new int[1];
        tos = -1;
    }
    public int size(){
        return tos+1;
    }
    public void push(int val){
        if(tos == data.length-1){
            int[] ndata = new int[2*data.length];
            for(int i = 0; i<data.length; i++){
                ndata[i]= data[i];
            }
            data = ndata;
            tos++;
            data[tos]=val;
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
