public class Swap4 {
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
    public static void swap(Person per1, Person per2){ //p1 and p2 referance copied
        per1 = new Person(); //new object is creted with null values
        // per1 is empty now
        int age = per1.age;  // since it is empty and int type value is 0
        per1.age = per2.age; // per2 is not empty so per2 age value assigned to per1 - 20
        per2.age = age; // age is 0 hence per2 age is 0

        per2 = new Person(); 

        String name = per1.name; // person 1 name is null,
        per1.name = per2.name; 
        per2.name = name;

    }
}
