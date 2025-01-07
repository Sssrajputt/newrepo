
public class Calculator {
    public static void main(String[] args) {
          System.out.println("Welcome");


Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
    // Display menu
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
       
          System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        double result;

        // Perform operation using switch
        switch (choice) {
                case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
                case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
                case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
                default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        scanner.close();




}
}
