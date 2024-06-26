import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        String operation = "Division";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        
        switch (operation) {
            case "Addition":
                System.out.println("Sum: " + (firstNum + secondNum));
                break;
            case "Subtraction":
                System.out.println("Difference: " + (firstNum - secondNum));
                break;
            case "Multiplication":
                System.out.println("Product: " + (firstNum * secondNum));
                break;
            case "Division":
                if (secondNum != 0) {
                    System.out.println("Quotient: " + (firstNum / secondNum));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Unknown operation.");
                break;
        }
        
        scanner.close();
    }
}