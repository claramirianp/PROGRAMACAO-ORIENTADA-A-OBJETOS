import java.util.Scanner;

public class Hotel {

    private Reserva[] reservas;
    private Scanner scanner;

    public Hotel() {
        reservas = new Reserva[2];
        reservas[0] = new Reserva(1, "Maria Silva", 3, true);
        reservas[1] = new Reserva(2, "João Pereira", 5);
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.exibirMenu();
    }

    private void exibirMenu() {
        int opcao = -1;

        do {
            System.out.println("\n===== MENU HOTEL FAZENDA =====");
            System.out.println("1 - Listar reservas");
            System.out.println("2 - Calcular valor da diária (com ou sem taxa de limpeza)");
            System.out.println("3 - Adicionar passeio (com ou sem quantidade)");
            System.out.println("4 - Exibir reserva (com ou sem detalhes)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarReservas();
                    break;
                case 2:
                    calcularDiaria();
                    break;
                case 3:
                    adicionarPasseio();
                    break;
                case 4:
                    exibirReserva();
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

    private void listarReservas() {
        System.out.println("\n-- Reservas cadastradas --");
        for (int i = 0; i < reservas.length; i++) {
            System.out.println((i + 1) + " - " + reservas[i].exibirReserva(true));
        }
    }

    private Reserva selecionarReserva() {
        listarReservas();
        System.out.print("Escolha o número da reserva: ");
        int indice = lerInteiro() - 1;

        while (indice < 0 || indice >= reservas.length) {
            System.out.print("Índice inválido. Escolha novamente: ");
            indice = lerInteiro() - 1;
        }
        return reservas[indice];
    }

    private void calcularDiaria() {
        Reserva reserva = selecionarReserva();

        System.out.print("Incluir taxa de limpeza? (1-Sim / 0-Não): ");
        boolean comTaxa = lerInteiro() == 1;

        double valor;
        if (comTaxa) {
            System.out.print("Informe o valor da taxa de limpeza (R$): ");
            double taxa = lerDouble();
            valor = reserva.calcularDiaria(taxa);
        } else {
            valor = reserva.calcularDiaria();
        }
        System.out.printf("Valor total da hospedagem: R$ %.2f%n", valor);
    }

    private void adicionarPasseio() {
        Reserva reserva = selecionarReserva();

        System.out.print("Informe o tipo de passeio (CAVALGADA, TRILHA ou PESCA): ");
        String tipo = scanner.nextLine();

        System.out.print("Informar quantidade? (1-Sim / 0-Não): ");
        boolean comQuantidade = lerInteiro() == 1;

        double valor;
        if (comQuantidade) {
            System.out.print("Informe a quantidade: ");
            int quantidade = lerInteiro();
            valor = reserva.adicionarPasseio(tipo, quantidade);
        } else {
            valor = reserva.adicionarPasseio(tipo);
        }
        System.out.printf("Custo do passeio: R$ %.2f%n", valor);
    }

    private void exibirReserva() {
        Reserva reserva = selecionarReserva();

        System.out.print("Exibir com detalhes (refeições)? (1-Sim / 0-Não): ");
        boolean comDetalhes = lerInteiro() == 1;

        System.out.println(reserva.exibirReserva(comDetalhes));
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

    private double lerDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida, digite um número: ");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
}
