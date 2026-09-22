import java.util.Scanner;

public class Cinema {

    private SessaoCinema sessao;
    private Scanner scanner;

    public Cinema() {
        sessao = new SessaoCinema(3, "Duna: Parte Três", 80, 30.00);
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.exibirMenu();
    }

    private void exibirMenu() {
        int opcao = -1;

        do {
            System.out.println("\n===== MENU CINEMA =====");
            System.out.println("1 - Vender 1 ingresso");
            System.out.println("2 - Vender quantidade de ingressos");
            System.out.println("3 - Vender ingressos com opção de meia-entrada");
            System.out.println("4 - Calcular bilheteria total");
            System.out.println("5 - Exibir sessão (com ou sem lotação)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    venderUmIngresso();
                    break;
                case 2:
                    venderQuantidade();
                    break;
                case 3:
                    venderComMeiaEntrada();
                    break;
                case 4:
                    calcularBilheteria();
                    break;
                case 5:
                    exibirSessao();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private void venderUmIngresso() {
        double valor = sessao.venderIngresso();
        reportarVenda(valor);
    }

    private void venderQuantidade() {
        System.out.print("Informe a quantidade de ingressos: ");
        int quantidade = lerInteiro();

        double valor = sessao.venderIngresso(quantidade);
        reportarVenda(valor);
    }

    private void venderComMeiaEntrada() {
        System.out.print("Informe a quantidade de ingressos: ");
        int quantidade = lerInteiro();

        System.out.print("Meia-entrada? (1-Sim / 0-Não): ");
        boolean meiaEntrada = lerInteiro() == 1;

        double valor = sessao.venderIngresso(quantidade, meiaEntrada);
        reportarVenda(valor);
    }

    private void reportarVenda(double valor) {
        if (valor < 0) {
            System.out.println("Venda não realizada: não há lugares suficientes.");
        } else {
            System.out.printf("Venda realizada. Valor total: R$ %.2f%n", valor);
        }
        System.out.println(sessao.exibirSessao(true));
    }

    private void calcularBilheteria() {
        double valor = sessao.calcularBilheteria();
        System.out.printf("Bilheteria total arrecadada: R$ %.2f%n", valor);
    }

    private void exibirSessao() {
        System.out.print("Mostrar lotação? (1-Sim / 0-Não): ");
        boolean mostrarLotacao = lerInteiro() == 1;

        System.out.println(sessao.exibirSessao(mostrarLotacao));
    }

    private int lerInteiro() {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida, digite um número: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}
