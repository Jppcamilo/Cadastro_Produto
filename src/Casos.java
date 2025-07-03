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
        String nome;
        while (true) {
            System.out.println("Digite o nome do produto:");
            nome = leitordeDados.nextLine();
            boolean nomeExistente = false;
            for (Produto produto : listadeProduto) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("❌ Produto já cadastrado. Tente novamente com um nome diferente.");
                    nomeExistente = true;
                    break;
                }
            }
            if (!nomeExistente) {
                break;
            }
        }
        System.out.println("Digite o preço do produto:");
        double preco = Double.parseDouble(leitordeDados.nextLine().replace(",", "."));

        System.out.println("Digite a quantidade do produto:");
        int quantidade = Integer.parseInt(leitordeDados.nextLine());

        listadeProduto.add(new Produto(nome, preco, quantidade));
        System.out.println("✅ Produto adicionado com sucesso!");
    }

    public void editarProduto() {
        if (listadeProduto.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            System.out.println("Deseja adicionar um produto? (S/N)");
            String resposta = leitordeDados.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                adicionarProduto();
            }
        } else {
            System.out.println("Digite o nome do produto que deseja editar: ");
            String nomeEditar = leitordeDados.nextLine();
            boolean encontrado = false;
            for (Produto produto : listadeProduto) {
                if (nomeEditar.equalsIgnoreCase(produto.getNome())) {
                    encontrado = true;
                    System.out.println("Produto encontrado! Digite os novos dados:");
                    System.out.print("Novo nome: ");
                    String novoNome = leitordeDados.nextLine();
                    System.out.print("Novo preço: ");
                    double novoPreco = Double.parseDouble(leitordeDados.nextLine().replace(",", "."));
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = Integer.parseInt(leitordeDados.nextLine());

                    produto.setNome(novoNome);
                    produto.setPreco(novoPreco);
                    produto.setQuantidade(novaQuantidade);

                    System.out.println("Produto editado com sucesso!");
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Produto não encontrado.");
            }
        }

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
