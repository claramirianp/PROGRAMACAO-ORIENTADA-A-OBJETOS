import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Eletronico produto = null;

        System.out.println("===== LOJA DE ELETRÔNICOS =====");
        System.out.println("1 - Fone de Ouvido");
        System.out.println("2 - Smartphone");
        System.out.println("3 - Notebook");
        System.out.println("4 - Smartwatch");
        System.out.print("Escolha o produto: ");

        int opcao = Integer.parseInt(sc.nextLine());

        // Entrada dos dados comuns
        System.out.print("Digite a marca: ");
        String marca = sc.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Digite o preço: R$ ");
        Double preco = Double.parseDouble(
            sc.nextLine().replace(",", ".")
        );

        // Escolha do produto
        switch (opcao) {

            case 1:
                System.out.print("Tipo de conexão: ");
                String tipoConexao = sc.nextLine();

                produto = new FoneDeOuvido(
                    marca, modelo, preco, tipoConexao
                );
                break;

            case 2:
                System.out.print("Capacidade de armazenamento (GB): ");
                int armazenamento = Integer.parseInt(sc.nextLine());

                produto = new Smartphone(
                    marca, modelo, preco, armazenamento
                );
                break;

            case 3:
                System.out.print("Processador: ");
                String processador = sc.nextLine();

                produto = new Notebook(
                    marca, modelo, preco, processador
                );
                break;

            case 4:
                System.out.print("É resistente à água? (S/N): ");
                boolean resistenteAgua =
                    sc.nextLine().equalsIgnoreCase("S");

                produto = new Smartwatch(
                    marca, modelo, preco, resistenteAgua
                );
                break;

            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        // Aplicação do desconto
        if (produto instanceof Desconto) {

            System.out.print("Digite a porcentagem de desconto: ");
            Double porcentagem = Double.parseDouble(
                sc.nextLine().replace(",", ".")
            );

            Desconto desconto = (Desconto) produto;

            Double valorDesconto =
                desconto.aplicarDesconto(porcentagem);

            System.out.println("Valor do desconto: R$ " + valorDesconto);
        }

        // Exibição dos dados
        System.out.println("\n===== DADOS DO PRODUTO =====");
        System.out.println(produto.detalhar());

        System.out.println("\nPreço final: R$ " + produto.precoFinal());

        sc.close();
    }
}

/*
 * Dados ja inseridos
 * 
 *  public class Loja {

    public static void main(String[] args) {

        FoneDeOuvido fone = new FoneDeOuvido(
            "JBL", "Tune 520BT", 250.0, "Bluetooth"
        );

        Smartphone celular = new Smartphone(
            "Samsung", "Galaxy S24", 3000.0, 256
        );

        Notebook notebook = new Notebook(
            "Dell", "Inspiron", 4500.0, "Intel Core i7"
        );

        Smartwatch relogio = new Smartwatch(
            "Apple", "Watch Series", 2000.0, true
        );

        // Aplicando descontos
        fone.aplicarDesconto(10.0);
        celular.aplicarDesconto(15.0);
        notebook.aplicarDesconto(20.0);

        // Exibindo informações
        System.out.println("=== FONE DE OUVIDO ===");
        System.out.println(fone.detalhar());

        System.out.println("\n=== SMARTPHONE ===");
        System.out.println(celular.detalhar());

        System.out.println("\n=== NOTEBOOK ===");
        System.out.println(notebook.detalhar());

        System.out.println("\n=== SMARTWATCH ===");
        System.out.println(relogio.detalhar());
    }
}
 */
