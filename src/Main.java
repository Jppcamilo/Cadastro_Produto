import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitordeDados = new Scanner(System.in);
        casos casos = new casos(leitordeDados);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("+----------------------+-------------------------+");
            System.out.println("| Opção                | Descrição               |");
            System.out.println("+----------------------+-------------------------+");
            System.out.println("| 1                    | Lista produtos          |");
            System.out.println("| 2                    | Adicionar produto       |");
            System.out.println("| 3                    | Remover produto         |");
            System.out.println("| 4                    | Sair                    |");
            System.out.println("+----------------------+-------------------------+");
            opcao = leitordeDados.nextInt();

            switch (opcao) {

                case 1:
                    casos.listaProdutos();
                case 2:
                    casos.adicionarProduto();

                case 3:
                    casos.removerProduto();
            }

        }
    }
}

