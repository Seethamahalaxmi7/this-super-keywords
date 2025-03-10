// Class with instance variables and a method using 'this'
class Example {
    int number = 10;
    String text = "Hello, bro!";

    // Method to print instance members using 'this'
    void display() {
        System.out.println("Number: " + this.number);
        System.out.println("Text: " + this.text);
    }

    // Main method
    public static void main(String[] args) {
        new Example().display(); // Creating an object and calling display() without storing it in a variable
    }
}
