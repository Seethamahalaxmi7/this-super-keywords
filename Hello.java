class Hello {
    int number;
    String text;

    // Default Constructor
    Hello() {
        this(10, "Hello, bro!"); // Calls the parameterized constructor
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Hello(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Parameterized Constructor Called");
    }

    // Method to display values
    void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Example obj = new Example(); // Calls default constructor
        obj.display(); // Prints values
    }
}
