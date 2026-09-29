import java.util.Scanner;

public class Transporte {

    private Onibus[] onibus;
    private Scanner scanner;

    public Transporte() {
        onibus = new Onibus[2];
        onibus[0] = new Onibus(101, "Centro - Bairro Industrial", 40, 4.50);
        onibus[1] = new Onibus(202, "Terminal - Universidade", 50);
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Transporte transporte = new Transporte();
        transporte.exibirMenu();
    }

    private void exibirMenu() {
        int opcao = -1;

        do {
            System.out.println("\n===== MENU TRANSPORTE =====");
            System.out.println("1 - Listar ônibus");
            System.out.println("2 - Embarcar passageiro(s)");
            System.out.println("3 - Desembarcar passageiro(s)");
            System.out.println("4 - Calcular renda (SIMPLES ou INTEGRADA)");
            System.out.println("5 - Exibir informações (com ou sem detalhes)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    listarOnibus();
                    break;
                case 2:
                    embarcar();
                    break;
                case 3:
                    desembarcar();
                    break;
                case 4:
                    calcularRenda();
                    break;
                case 5:
                    exibirInfo();
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

    private void listarOnibus() {
        System.out.println("\n-- Ônibus cadastrados --");
        for (int i = 0; i < onibus.length; i++) {
            System.out.println((i + 1) + " - " + onibus[i].exibirInfo(true));
        }
    }

    private Onibus selecionarOnibus() {
        listarOnibus();
        System.out.print("Escolha o número do ônibus: ");
        int indice = lerInteiro() - 1;

        while (indice < 0 || indice >= onibus.length) {
            System.out.print("Índice inválido. Escolha novamente: ");
            indice = lerInteiro() - 1;
        }
        return onibus[indice];
    }

    private void embarcar() {
        Onibus bus = selecionarOnibus();

        System.out.print("Informar quantidade? (1-Sim / 0-Não, embarca 1 passageiro): ");
        boolean comQuantidade = lerInteiro() == 1;

        boolean sucesso;
        if (comQuantidade) {
            System.out.print("Informe a quantidade de passageiros: ");
            int quantidade = lerInteiro();
            sucesso = bus.embarcarPassageiro(quantidade);
        } else {
            sucesso = bus.embarcarPassageiro();
        }

        System.out.println(sucesso ? "Embarque realizado com sucesso." : "Não há capacidade disponível.");
        System.out.println(bus.exibirInfo(true));
    }

    private void desembarcar() {
        Onibus bus = selecionarOnibus();

        System.out.print("Informar quantidade? (1-Sim / 0-Não, desembarca 1 passageiro): ");
        boolean comQuantidade = lerInteiro() == 1;

        boolean sucesso;
        if (comQuantidade) {
            System.out.print("Informe a quantidade de passageiros: ");
            int quantidade = lerInteiro();
            sucesso = bus.desembarcarPassageiro(quantidade);
        } else {
            sucesso = bus.desembarcarPassageiro();
        }

        System.out.println(sucesso ? "Desembarque realizado com sucesso." : "Passageiros a bordo insuficientes.");
        System.out.println(bus.exibirInfo(true));
    }

    private void calcularRenda() {
        Onibus bus = selecionarOnibus();

        System.out.print("Informe o tipo de tarifa (SIMPLES ou INTEGRADA): ");
        String tipoTarifa = scanner.nextLine();

        double renda = bus.calcularRenda(tipoTarifa);
        System.out.printf("Renda calculada: R$ %.2f%n", renda);
    }

    private void exibirInfo() {
        Onibus bus = selecionarOnibus();

        System.out.print("Exibir detalhado? (1-Sim / 0-Não): ");
        boolean detalhado = lerInteiro() == 1;

        System.out.println(bus.exibirInfo(detalhado));
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
