public class Swap {
    public static void main(String[] args) {
        Person p1 = new Person(); // from Class program
        p1.age = 15;
        p1.name = "A";

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";

        
        p1.saysHi();
        p2.saysHi();
        swap(p1, p2);
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap(Person per1, Person per2){//When you pass an object to a method, 
    // Java passes a copy of the reference, 
    // not the original reference itself. here p1 and p2 doesn't paseed instead 
    // a copy of those reference are passed. 
    // when you swap the reference inside a method 
        Person temp = per1;
        per1 = per2;
        per2 = temp; 
            System.out.println("\nswapped reference:");
            
            per1.saysHi();
            per2.saysHi();
            System.out.println();
        // inside this method object reference are changed but
        // it doesn't change refereces of p1 and p2 because 
        // per1 and per2 were copy of p1 and p2.
        // when excecution of this method completes, along with it, 
        // per1 and per2 were also deleted.
        // what is left in the call stack will be executed which are p1 and p2
        // which are not swapped at all.
        
    }
}
