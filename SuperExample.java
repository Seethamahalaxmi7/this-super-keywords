// Parent Class
class Parent {
    int number = 100;
    String text = "Hello from Parent!";

    void showParent() {
        System.out.println("Parent Method: " + text);
    }
}

// Child Class
class Child extends Parent {
    int number = 200; // This hides the parent class variable

    void display() {
        // Accessing parent class instance variables using 'super'
        System.out.println("Parent Number: " + super.number);
        System.out.println("Child Number: " + this.number);
        
        // Calling parent class method using 'super'
        super.showParent();
    }
}

// ✅ Main Class (File must be named `SuperExample.java`)
public class SuperExample {
    public static void main(String[] args) {
        Child obj = new Child(); // Creating an object of Child class
        obj.display(); // Calling display() to print parent and child class members
    }
}
