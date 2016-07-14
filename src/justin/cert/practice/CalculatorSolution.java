package justin.cert.practice;

/**
 * TASKS:
 * NOTE: Don't worry about access modifiers when creating your methods. Focus on return types and parameters only.
 * (1) Create a method called 'add'. It should take 2 integers as parameters and return the value of them added together.
 * (2) Create a method called 'subtract'. It should take 2 integers as parameters and return the value of the first parameter minus the second.
 * (3) Create a method called 'multiply'. It should take 2 integers as parameters and return the value of the multiplied together.
 * (4) Create a method called 'divide'. It should take 2 integers as parameters and return the value of the first parameter divided by the second.
 * (5) Create a method called 'testCalc'. It should return an integer equal to (10 + 10) / (20 - (3 * 5)) using ONLY the methods you've created.
 */
public class CalculatorSolution {
    
    // (1)
    int add(int a, int b) {
        return a + b;
    }
    
    // (2)
    int subtract(int a, int b) {
        return a - b;
    }
    
    // (3)
    int multiply(int a, int b) {
        return a * b;
    }
    
    // (4)
    int divide(int a, int b) {
        return a / b;
    }
    
    // (5) If you run your solution and get 'Result: 4'. Good work!!
    public int testCalc() {
        return divide(add(10, 10), subtract(20, multiply(3, 5)));
    }
    
    // Don't edit the code below. It will test your 'testCalc' method when you have finished all of the tasks.
    // Run this file when you think you have the correct answer, then check the output!
    public static void main(String[] args) {
        CalculatorSolution calc = new CalculatorSolution();
        
        int result = calc.testCalc();
        System.out.println("Result: " + result);
    }
}
