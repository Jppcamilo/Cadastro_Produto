import java.util.ArrayList;
import java.util.Scanner;

public class Casos {

    private final ArrayList<Produto> listadeProduto;
    private final Scanner leitordeDados;

    public Casos(Scanner leitordeDados) {

        this.leitordeDados = leitordeDados;
        this.listadeProduto = new ArrayList<>();

    }

    public void listaProdutos() {
        if (listadeProduto.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            System.out.println("Deseja adicionar um produto? (S/N)");
            String resposta = leitordeDados.next();
            if(resposta.equalsIgnoreCase("S")){
                adicionarProduto();
            }
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : listadeProduto) {
                System.out.println(produto.mostrar());
            }
        }
    }

    public void adicionarProduto(){
        //Adicionar o nome
        System.out.println("Digite o nome do produto:");
        String nome = leitordeDados.next();
        //Adicionar o preço
        System.out.println("Digite o preço do produto:");
        double preco = leitordeDados.nextDouble();
        //Adicionar a quantidade
        System.out.println("Digite a quantidade do produto:");
        // Adicionar o produto na lista
        int quantidade = leitordeDados.nextInt();
        listadeProduto.add(new Produto(nome, preco, quantidade));
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(){
        if (listadeProduto.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            System.out.println("Deseja adicionar um produto? (S/N)");
            String resposta = leitordeDados.next();
            if(resposta.equalsIgnoreCase("S")){
                adicionarProduto();
            }
        } else {
            System.out.println("Digite o nome do produto que deseja remover: ");
            String nomeRemover = leitordeDados.next();
            boolean encontrado = false;
            for (Produto produto: listadeProduto){
                if (nomeRemover.equalsIgnoreCase(produto.getNome())){
                    listadeProduto.remove(produto);
                    System.out.println("Produto removido com sucesso!");
                    encontrado = true;
                    break;
                } else {
                    System.out.println("Produto não encontrado.");
                    encontrado = false;
                }
            }
        }
    }

    public void sair(){
        System.out.println("👋 Obrigado por usar o sistema! Até logo!");
        leitordeDados.close();
        System.exit(0); // Encerra o programa
    }
}
