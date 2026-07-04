public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name="raj";
        s1.age=20;
        s1.display();
    }
}

class Student{
    int age;
    String name;
    void display(){
        System.out.println(name+" Age "+ age);
    }
    Student(){
        // default constructor
        // same name as class but without any parameters
        // default constructer invoked automatically
        // whenever a new object of the class is created
        // it doesn't require to call explicitly
        // If you write a class without any constructors,
        // the Java compiler automatically inserts an invisible, 
        // no-argument default constructor during compilation
    }
}