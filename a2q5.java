import java.util.Scanner;

public class a2q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Arithmetic Operations::::");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int ch = sc.nextInt();  // Taking input for choice from the user

        System.out.print("Enter the first number: ");
        double num = sc.nextDouble();  // Taking first number input from the user

        System.out.print("Enter the second number: ");
        double num1 = sc.nextDouble();  // Taking second number input from the user

        double result = 0;

        switch (ch) {
            case 1:
                result = num + num1;
                System.out.println("Addition::: " + result);
                break;
            case 2:
                result = num - num1;
                System.out.println("Subtraction::: " + result);
                break;
            case 3:
                result = num * num1;
                System.out.println("Multiplication::: " + result);
                break;
            case 4:
                if (num != 0) {
                    result = num  / num1;
                    System.out.println("Division::: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();  // Close the scanner to prevent resource leaks
    }
}
