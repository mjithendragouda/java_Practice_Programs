public class Class {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 15;
        p1.name = "A";
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
        p2.saysHi();

        // p1 and p2 are not objects but they are references 
        // when new is used a space will be alloted in Heap memory
        //that space is called objects or Instanced which are
        //  referenced by these p1 or p2, they hold the memory address.
        //see below
        Person p3 = p1; //here p1's referenced object addess is coiped that't it
        
        p3.age = 30;
        p1.saysHi(); 
        p3.saysHi();
    }
}

class Person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name+"["+age+"] says hi");
        }
    }