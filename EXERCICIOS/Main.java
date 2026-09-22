public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque(5);

        Produto produto1 =
                new Produto(1, "Teclado", 100.00f, 10);

        Produto produto2 =
                new Produto(2, "Mouse", 50.00f, 20);

        Produto produto3 =
                new Produto(3, "Monitor", 900.00f, 5);

        estoque.adicionaProduto(produto1);
        estoque.adicionaProduto(produto2);
        estoque.adicionaProduto(produto3);

        estoque.listarProdutos();

        Produto encontradoPorCodigo = estoque.buscaProduto(2);

        if (encontradoPorCodigo != null) {
            System.out.println("\nProduto encontrado pelo código:");
            System.out.println(encontradoPorCodigo);
        } else {
            System.out.println("\nProduto não encontrado!");
        }

        Produto encontradoPorDescricao =
                estoque.buscaProduto("Monitor");

        if (encontradoPorDescricao != null) {
            System.out.println("\nProduto encontrado pela descrição:");
            System.out.println(encontradoPorDescricao);
        } else {
            System.out.println("\nProduto não encontrado!");
        }

        estoque.excluiProduto(produto1);

        estoque.listarProdutos();
    }
}
