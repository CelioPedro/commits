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

public class TestMainExercicio4 {
    
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
        
        // Dados de teste pré-cadastrados
        Produto[] produtos = {
            new Produto("Arroz", 5.50, 100, new DataValidade(12, 2024)),
            new Produto("Feijão", 8.75, 80, new DataValidade(10, 2024)),
            new Produto("Azeite", 25.90, 30, new DataValidade(8, 2025)),
            new Produto("Café", 12.30, 50, new DataValidade(6, 2024)),
            new Produto("Açúcar", 4.20, 120, new DataValidade(9, 2024))
        };
        
        int produtosCadastrados = 5;
        
        System.out.println("=== SISTEMA DE PRODUTOS (DADOS DE TESTE) ===");
        System.out.println("Produtos cadastrados:");
        for (int i = 0; i < produtosCadastrados; i++) {
            System.out.println((i+1) + ". " + produtos[i].nome + " - R$ " + produtos[i].precoUnitario);
        }
        
        System.out.print("\nDigite o valor mínimo para filtrar os produtos: R$ ");
        double valorMinimo = scanner.nextDouble();
        
        listarProdutosAcimaValor(produtos, produtosCadastrados, valorMinimo);
        
        scanner.close();
    }
}
