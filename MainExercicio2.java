import java.util.Scanner;

public class MainExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 5;
        int numAssessments = 3;
        double[][] grades = new double[numStudents][numAssessments];
        
        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < numAssessments; j++) {
                System.out.print("Nota da avaliação " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
        }
        
        // Calculate total grades and average for each assessment
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < numStudents; i++) {
            double total = 0;
            for (int j = 0; j < numAssessments; j++) {
                total += grades[i][j];
            }
            System.out.println("Total do aluno " + (i + 1) + ": " + total);
        }
        
        // Calculate average for each assessment
        for (int j = 0; j < numAssessments; j++) {
            double sum = 0;
            for (int i = 0; i < numStudents; i++) {
                sum += grades[i][j];
            }
            double average = sum / numStudents;
            System.out.println("Média da avaliação " + (j + 1) + ": " + average);
        }
        
        scanner.close();
    }
}
