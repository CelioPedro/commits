import java.util.Scanner;

public class MainFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = scanner.nextInt();

        if (n1 > 0) {
            int factorial = 1;
            for (int i = 1; i <= n1; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n1 + " is: " + factorial);

        } else if (n1 == 0) {
            System.out.println("Factorial of 0 is: 1");
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        
        scanner.close();
}
}

    
        
