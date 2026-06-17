public class Swap3 {
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
        System.out.println("\nSwapped: ");
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap(Person per1, Person per2){
        int age = per1.age;
        per1.age = per2.age;
        per2.age = age;

        String name = per1.name;
        per1.name = per2.name;
        per2.name = name;
    }
    
}
