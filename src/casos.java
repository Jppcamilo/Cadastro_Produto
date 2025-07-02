public class casos {

    public int opcao;

    public casos(int opcao) {
        this.opcao = opcao;
    }

    public String caso1 () {
        if (listadeProduto.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : listadeProduto) {
                System.out.println(produto.mostrar());
            }
        }
        break;
    }

}
