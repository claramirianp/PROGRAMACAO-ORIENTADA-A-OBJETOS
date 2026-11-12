public class SessaoCinema {

    private int numeroDaSala;
    private String filme;
    private int capacidade;
    private int ingressosVendidos;
    private double precoIngresso;

    private static final double PRECO_PADRAO = 25.00;

    // Construtor básico (preço padrão de R$ 25,00)
    public SessaoCinema(int numeroDaSala, String filme, int capacidade) {
        this(numeroDaSala, filme, capacidade, PRECO_PADRAO);
    }

    // Construtor completo, permitindo definir o preço do ingresso
    public SessaoCinema(int numeroDaSala, String filme, int capacidade, double precoIngresso) {
        this.numeroDaSala = numeroDaSala;
        this.filme = filme;
        this.capacidade = capacidade;
        this.precoIngresso = precoIngresso;
        this.ingressosVendidos = 0;
    }

    // Vende 1 ingresso
    public double venderIngresso() {
        return venderIngresso(1, false);
    }

    // Vende a quantidade informada, sem meia-entrada
    public double venderIngresso(int quantidade) {
        return venderIngresso(quantidade, false);
    }

    // Vende a quantidade informada, com opção de meia-entrada
    public double venderIngresso(int quantidade, boolean meiaEntrada) {
        if (ingressosVendidos + quantidade > capacidade) {
            return -1.0;
        }

        ingressosVendidos += quantidade;
        double valorVenda = quantidade * precoIngresso;

        if (meiaEntrada) {
            valorVenda *= 0.5;
        }

        return valorVenda;
    }

    // Valor bruto arrecadado, sem considerar meias-entradas
    public double calcularBilheteria() {
        return ingressosVendidos * precoIngresso;
    }

    // Exibição básica
    public String exibirSessao() {
        return String.format("Sala %d - Filme: %s - Ingresso: R$ %.2f", numeroDaSala, filme, precoIngresso);
    }

    // Exibição com opção de mostrar a lotação
    public String exibirSessao(boolean mostrarLotacao) {
        String base = exibirSessao();

        if (mostrarLotacao) {
            base += String.format(" - Lotação: %d/%d", ingressosVendidos, capacidade);
        }

        return base;
    }

    // Getters e setters (encapsulamento)
    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
}
