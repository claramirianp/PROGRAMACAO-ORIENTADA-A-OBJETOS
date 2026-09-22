public class Estoque {

    private Produto[] produtos;

    public Estoque(int tamanho) {
        produtos = new Produto[tamanho];
    }

    public void adicionaProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                System.out.println("Produto adicionado com sucesso!");
                return;
            }
        }

        System.out.println("O estoque está cheio!");
    }

    public void excluiProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == produto) {
                produtos[i] = null;
                System.out.println("Produto excluído com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado!");
    }

    public Produto buscaProduto(int codigo) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null
                    && produtos[i].getCodigo() == codigo) {
                return produtos[i];
            }
        }

        return null;
    }

    public Produto buscaProduto(String descricao) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null
                    && produtos[i].getDescricao()
                            .equalsIgnoreCase(descricao)) {
                return produtos[i];
            }
        }

        return null;
    }

    public void listarProdutos() {
        System.out.println("\n--- PRODUTOS DO ESTOQUE ---");

        boolean encontrouProduto = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i]);
                System.out.println("--------------------------");
                encontrouProduto = true;
            }
        }

        if (!encontrouProduto) {
            System.out.println("O estoque está vazio.");
        }
    }
}
