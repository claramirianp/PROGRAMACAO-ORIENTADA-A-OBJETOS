public class Onibus {

    private int numero;
    private String linha;
    private int capacidade;
    private int passageirosAtuais;
    private double tarifa;

    private static final double TARIFA_PADRAO = 4.50;

    // Construtor sem tarifa (usa o valor padrão)
    public Onibus(int numero, String linha, int capacidade) {
        this(numero, linha, capacidade, TARIFA_PADRAO);
    }

    // Construtor completo
    public Onibus(int numero, String linha, int capacidade, double tarifa) {
        this.numero = numero;
        this.linha = linha;
        this.capacidade = capacidade;
        this.tarifa = tarifa;
        this.passageirosAtuais = 0;
    }

    // Embarca 1 passageiro
    public boolean embarcarPassageiro() {
        return embarcarPassageiro(1);
    }

    // Embarca a quantidade informada, se houver capacidade disponível
    public boolean embarcarPassageiro(int quantidade) {
        if (passageirosAtuais + quantidade > capacidade) {
            return false;
        }
        passageirosAtuais += quantidade;
        return true;
    }

    // Desembarca 1 passageiro
    public boolean desembarcarPassageiro() {
        return desembarcarPassageiro(1);
    }

    // Desembarca a quantidade informada, se houver passageiros suficientes a bordo
    public boolean desembarcarPassageiro(int quantidade) {
        if (quantidade > passageirosAtuais) {
            return false;
        }
        passageirosAtuais -= quantidade;
        return true;
    }

    // Renda de acordo com o tipo de tarifa
    public double calcularRenda(String tipoTarifa) {
        switch (tipoTarifa.toUpperCase()) {
            case "SIMPLES":
                return passageirosAtuais * tarifa;
            case "INTEGRADA":
                return passageirosAtuais * tarifa * 1.5;
            default:
                return 0.0;
        }
    }

    // Informação básica
    public String exibirInfo() {
        return String.format("Ônibus %d - Linha: %s", numero, linha);
    }

    // Informação detalhada ou resumida
    public String exibirInfo(boolean detalhado) {
        if (detalhado) {
            return String.format("Ônibus %d - Linha: %s - Passageiros: %d/%d - Tarifa: R$ %.2f",
                    numero, linha, passageirosAtuais, capacidade, tarifa);
        } else {
            return String.format("Ônibus %d - Linha: %s - Tarifa: R$ %.2f", numero, linha, tarifa);
        }
    }

    // Getters e setters (encapsulamento)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPassageirosAtuais() {
        return passageirosAtuais;
    }

    public void setPassageirosAtuais(int passageirosAtuais) {
        this.passageirosAtuais = passageirosAtuais;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
