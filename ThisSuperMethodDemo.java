// Parent Class
class Parent {
    void show() {
        System.out.println("Parent class show() method");
    }
}

// Child Class
class Child extends Parent {
    void show() {
        System.out.println("Child class show() method");
    }

    void display() {
        System.out.println("Calling method inside same class using this:");
        this.show(); // Calls Child class show()

        System.out.println("\nCalling parent class method using super:");
        super.show(); // Calls Parent class show()
    }
}

// Main Class
public class ThisSuperMethodDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Calls display() which uses this and super
    }
}
