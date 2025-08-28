import java.util.Scanner;

// Classe para data de validade estruturada
class DataValidade {
    int mes;
    int ano;
    
    DataValidade(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return mes + "/" + ano;
    }
}

// Classe para produtos
class Produto {
    String nome;
    double precoUnitario;
    int quantidadeEstoque;
    DataValidade dataValidade;
    
    Produto(String nome, double precoUnitario, int quantidadeEstoque, DataValidade dataValidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataValidade = dataValidade;
    }
}

public class MainExercicio4 {
    
    // Função para listar produtos acima de um valor
    public static void listarProdutosAcimaValor(Produto[] produtos, int numProdutos, double valorMinimo) {
        System.out.println("\nProdutos com preço acima de R$ " + valorMinimo + ":");
        boolean encontrou = false;
        
        for (int i = 0; i < numProdutos; i++) {
            if (produtos[i] != null && produtos[i].precoUnitario > valorMinimo) {
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Preço: R$ " + produtos[i].precoUnitario);
                System.out.println("Estoque: " + produtos[i].quantidadeEstoque);
                System.out.println("Validade: " + produtos[i].dataValidade);
                System.out.println("----------------------");
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum produto encontrado acima desse valor.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProdutos = 30;
        Produto[] produtos = new Produto[numProdutos];
        int produtosCadastrados = 0;
        
        int opcao;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar produtos");
            System.out.println("2. Listar produtos acima de um valor");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    if (produtosCadastrados >= numProdutos) {
                        System.out.println("Limite máximo de produtos atingido!");
                        break;
                    }
                    
                    System.out.println("\nCadastro de produtos (" + (produtosCadastrados + 1) + " de " + numProdutos + "):");
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Preço unitário: R$ ");
                    double preco = scanner.nextDouble();
                    
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    
                    System.out.print("Mês de validade (1-12): ");
                    int mes = scanner.nextInt();
                    
                    System.out.print("Ano de validade: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    
                    DataValidade dataValidade = new DataValidade(mes, ano);
                    produtos[produtosCadastrados] = new Produto(nome, preco, quantidade, dataValidade);
                    produtosCadastrados++;
                    
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                    
                case 2:
                    if (produtosCadastrados == 0) {
                        System.out.println("Nenhum produto cadastrado ainda!");
                        break;
                    }
                    
                    System.out.print("Digite o valor mínimo para filtrar os produtos: R$ ");
                    double valorMinimo = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer
                    
                    listarProdutosAcimaValor(produtos, produtosCadastrados, valorMinimo);
                    break;
                    
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 3);
        
        scanner.close();
    }
}
