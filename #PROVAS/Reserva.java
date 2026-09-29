public class Reserva {

    private int codigo;
    private String nomeHospede;
    private int diarias;
    private boolean incluiRefeicoes;

    private static final double VALOR_DIARIA = 200.0;
    private static final double VALOR_REFEICOES_DIA = 50.0;

    // Construtor sem informar refeições (inicializa como false)
    public Reserva(int codigo, String nomeHospede, int diarias) {
        this(codigo, nomeHospede, diarias, false);
    }

    // Construtor completo
    public Reserva(int codigo, String nomeHospede, int diarias, boolean incluiRefeicoes) {
        this.codigo = codigo;
        this.nomeHospede = nomeHospede;
        this.diarias = diarias;
        this.incluiRefeicoes = incluiRefeicoes;
    }

    // Valor da hospedagem sem taxa de limpeza
    public double calcularDiaria() {
        double valor = VALOR_DIARIA * diarias;

        if (incluiRefeicoes) {
            valor += VALOR_REFEICOES_DIA * diarias;
        }

        return valor;
    }

    // Valor da hospedagem com taxa de limpeza (cobrada uma única vez)
    public double calcularDiaria(double taxaLimpeza) {
        return calcularDiaria() + taxaLimpeza;
    }

    // Passeio avulso (quantidade 1)
    public double adicionarPasseio(String tipo) {
        return adicionarPasseio(tipo, 1);
    }

    // Passeio com quantidade informada
    public double adicionarPasseio(String tipo, int quantidade) {
        double valorUnitario;

        switch (tipo.toUpperCase()) {
            case "CAVALGADA":
                valorUnitario = 80.0;
                break;
            case "TRILHA":
                valorUnitario = 60.0;
                break;
            case "PESCA":
                valorUnitario = 70.0;
                break;
            default:
                return 0.0;
        }

        return valorUnitario * quantidade;
    }

    // Exibição básica
    public String exibirReserva() {
        return String.format("Reserva %d – Hospede: %s – Diárias: %d", codigo, nomeHospede, diarias);
    }

    // Exibição com detalhes (inclui informação sobre refeições)
    public String exibirReserva(boolean comDetalhes) {
        String base = exibirReserva();

        if (comDetalhes) {
            base += " – Refeições inclusas: " + (incluiRefeicoes ? "Sim" : "Não");
        }

        return base;
    }

    // Getters e setters (encapsulamento)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public boolean isIncluiRefeicoes() {
        return incluiRefeicoes;
    }

    public void setIncluiRefeicoes(boolean incluiRefeicoes) {
        this.incluiRefeicoes = incluiRefeicoes;
    }
}
