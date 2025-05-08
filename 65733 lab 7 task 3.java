class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    // Division
    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        System.out.println("Int Operations:");
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));

      
        System.out.println("\nDouble Operations:");
        System.out.println("Add: " + calc.add(10.5, 5.2));
        System.out.println("Subtract: " + calc.subtract(10.5, 5.2));
        System.out.println("Multiply: " + calc.multiply(10.5, 5.2));
        System.out.println("Divide: " + calc.divide(10.5, 5.2));
    }
}
