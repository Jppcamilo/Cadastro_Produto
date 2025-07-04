import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitordeDados = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService(leitordeDados);

        while (true) {
            System.out.println("===================================");
            System.out.println("     🔐 CADASTRO E LOGIN");
            System.out.println("===================================\n");
            System.out.println("1️⃣  📋 Cadastrar Usuário");
            System.out.println("2️⃣  🔑 Fazer Login");
            System.out.println("3️⃣  ❌ Sair");
            System.out.print("\nEscolha uma opção: ");
            int opcao = Integer.parseInt(leitordeDados.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("👉 Você escolheu: Cadastrar Usuário\n");
                    usuarioService.cadastrarUsuario();
                    break;

                case 2:
                    System.out.println("👉 Você escolheu: Fazer Login\n");
                    if (usuarioService.autenticarUsuario()) {
                        menu(leitordeDados);
                    } else {
                        System.out.println("❌ Falha na autenticação. Verifique seu usuário e senha.");
                    }
                    break;

                case 3:
                    System.out.println("❌ Saindo do sistema...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n❌ Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void menu(Scanner leitordeDados) {
        Casos casos = new Casos(leitordeDados);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n===================================");
            System.out.println("     📦 SISTEMA DE PRODUTOS");
            System.out.println("===================================\n");
            System.out.println("1️⃣  📋 Listar Produtos");
            System.out.println("2️⃣  ➕ Cadastrar Produto");
            System.out.println("3️⃣  ✏️ Editar Produto");
            System.out.println("4️⃣  🗑️ Deletar Produto");
            System.out.println("5️⃣  ❌ Sair");
            System.out.print("\nEscolha uma opção: ");
            try {
                opcao = Integer.parseInt(leitordeDados.nextLine());

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
                        System.out.println("👉 Você escolheu: Editar Produto\n");
                        casos.editarProduto();
                        break;

                    case 4:
                        System.out.println("👉 Você escolheu: Deletar Produto\n");
                        casos.removerProduto();
                        break;

                    case 5:
                        casos.sair();
                        return;

                    default:
                        System.out.println("\n❌ Opção inválida! Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n❌ Entrada inválida! Por favor, insira um número válido.");
            }
        }
    }
}