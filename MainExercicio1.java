import java.util.Scanner;

public class MainExercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        // Ler os 10 valores do vetor
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // a. Encontrar maior e menor valor
        int maior = vetor[0];
        int menor = vetor[0];
        
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        
        // b. Contar números pares e ímpares
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        // c. Calcular média aritmética
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        double media = (double) soma / 10;
        
        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println("Média aritmética: " + media);
        
        scanner.close();
    }
}
