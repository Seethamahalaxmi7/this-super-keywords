class ConstructorDemo {
    int number;
    String text;

    // Argument Constructor (Parameterized)
    ConstructorDemo(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Argument Constructor Called");
    }

    // Default Constructor calling Argument Constructor
    ConstructorDemo() {
        this(99, "Hello, Champion!"); // Calls the argument constructor
        System.out.println("Default Constructor Called");
    }

    // Method to display values
    void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    // Main Method
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(); // Calls default constructor
        obj.display(); // Prints values
    }
}
