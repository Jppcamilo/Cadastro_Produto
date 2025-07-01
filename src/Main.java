import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitordeDados = new Scanner(System.in);
        ArrayList<Produto> listadeProduto = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("+----------------------+-------------------------+");
            System.out.println("| Opção               | Descrição               |");
            System.out.println("+----------------------+-------------------------+");
            System.out.println("| 1                   | Lista produtos         |");
            System.out.println("| 2                   | Adicionar produto       |");
            System.out.println("| 3                   | Remover produto         |");
            System.out.println("| 4                   | Sair                    |");
            System.out.println("+----------------------+-------------------------+");
            opcao = leitordeDados.nextInt();

            switch (opcao) {

                case 1:
                    if (listadeProduto.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        System.out.println("Deseja adicionar um produto? (S/N)");
                        String opcaoSimNao = leitordeDados.next();
                        if (opcaoSimNao.equalsIgnoreCase("S")) {
                            opcao = 2;
                        }
                    } else {
                        System.out.println("Lista de produtos:");
                        for (Produto produto : listadeProduto) {
                            System.out.println(produto.mostrar());
                        }
                    }
                    break;

                case 2:
                    System.out.println("Teste");

            }

        }
        leitordeDados.close();
    }
}

