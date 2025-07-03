import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitordeDados = new Scanner(System.in);
        Casos casos = new Casos(leitordeDados);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===================================");
            System.out.println("     📦 SISTEMA DE PRODUTOS");
            System.out.println("===================================\n");
            System.out.println("1️⃣  📋 Listar Produtos");
            System.out.println("2️⃣  ➕ Cadastrar Produto");
            System.out.println("3️⃣  🗑️ Deletar Produto");
            System.out.println("4️⃣  ❌ Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = leitordeDados.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("👉 Você escolheu: Listar Produtos\n");
                    casos.listaProdutos();
                    break;
                case 2:
                    System.out.println("👉 Você escolheu: Cadastrar Produto\n");
                    casos.adicionarProduto();
                    break;
                case 3:
                    System.out.println("👉 Você escolheu: Deletar Produto\n");
                    casos.removerProduto();
                    break;
            }

            if (opcao == 4) {
                System.out.println("\n👋 Programa encerrado. Até logo!");
            } else if (opcao < 1 || opcao > 4) {
                System.out.println("\n❌ Opção inválida! Por favor, escolha entre as opções disponíveis.");
            }

        }

        }
}


