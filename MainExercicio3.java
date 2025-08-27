import java.util.Scanner;

public class TestMainExercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 3; // Reduced for testing
        String[] names = {"João Silva", "Maria Santos", "Pedro Oliveira"};
        String[] phones = {"(11) 9999-1111", "(11) 9999-2222", "(11) 9999-3333"};
        
        System.out.println("Dados de teste carregados:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Funcionário " + (i + 1) + ": " + names[i] + " - " + phones[i]);
        }
        
        // Menu de pesquisa
        int option;
        do {
            System.out.println("\n--- Menu de Pesquisa ---");
            System.out.println("1. Pesquisar funcionário");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            if (option == 1) {
                System.out.print("Digite o nome do funcionário a pesquisar: ");
                String searchName = scanner.nextLine();
                
                boolean found = false;
                for (int i = 0; i < numEmployees; i++) {
                    if (names[i].equalsIgnoreCase(searchName)) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println("Nome: " + names[i]);
                        System.out.println("Telefone: " + phones[i]);
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    System.out.println("Funcionário não encontrado.");
                }
            } else if (option != 2) {
                System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (option != 2);
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
