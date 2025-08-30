import java.util.Scanner;

public class MainPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
    
        if (n1 > n2)
            System.out.println("Bigger number is: " + n1);
        else if (n2 > n1)
            System.out.println("Bigger number is: " + n2);
        
        
        scanner.close();
}
}

    
        
