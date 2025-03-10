// Parent Class
class Parent {
    int number;
    
    // Parent Constructor
    Parent(int num) {
        this.number = num;
        System.out.println("Parent Constructor Called");
    }
}

// Child Class
class Child extends Parent {
    String text;
    
    // Child Constructor calling Parent Constructor using super()
    Child(int num, String txt) {
        super(num); // Calls Parent constructor
        this.text = txt;
        System.out.println("Child Constructor Called");
    }

    // Method to display values
    void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}

// Main Class
public class SuperConstructorDemo {
    public static void main(String[] args) {
        Child obj = new Child(50, "Hello, Bro!"); // Calls child constructor
        obj.display(); // Prints values
    }
}
