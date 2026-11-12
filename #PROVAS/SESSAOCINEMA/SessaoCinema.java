public class SessaoCinema {

    private int numeroDaSala;
    private String filme;
    private int capacidade;
    private int ingressosVendidos;
    private Double precoIngresso;

    public SessaoCinema(int numeroDaSala, String filme, int capacidade) {
        this(numeroDaSala, filme, capacidade, 25.0);
    }

    public SessaoCinema(int numeroDaSala, String filme, int capacidade, Double precoIngresso) {
        this.numeroDaSala = numeroDaSala;
        this.filme = filme;
        this.capacidade = capacidade;
        this.precoIngresso = precoIngresso;
        this.ingressosVendidos = 0;
    }

    public Double venderIngresso() {
        return venderIngresso(1, false);
    }

    public Double venderIngresso(int quantidade) {
        return venderIngresso(quantidade, false);
    }

    public Double venderIngresso(int quantidade, boolean meiaEntrada) {
        if (quantidade <= 0 || quantidade > this.capacidade - this.ingressosVendidos) {
            return -1.0;
        }

        this.ingressosVendidos += quantidade;
        double valorVenda = quantidade * this.precoIngresso;

        if (meiaEntrada) {
            valorVenda *= 0.5;
        }
        return valorVenda;
    }

    public Double calcularBilheteria() {
        return this.ingressosVendidos * this.precoIngresso;
    }

    public String exibirSessao() {
        return String.format("Sala %d - Filme: %s - Ingresso: R$ %.2f",
                this.numeroDaSala, this.filme, this.precoIngresso);
    }

    public String exibirSessao(boolean mostrarLotacao) {
        String exibir = exibirSessao();
        if (mostrarLotacao) {
            exibir += " - Lotação: " + this.ingressosVendidos + "/" + this.capacidade;
        }
        return exibir;
    }

    public int getNumeroDaSala() { return numeroDaSala; }
    public void setNumeroDaSala(int numeroDaSala) { this.numeroDaSala = numeroDaSala; }

    public String getFilme() { return filme; }
    public void setFilme(String filme) { this.filme = filme; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public Double getPrecoIngresso() { return precoIngresso; }
    public void setPrecoIngresso(Double precoIngresso) { this.precoIngresso = precoIngresso; }

    public int getIngressosVendidos() { return ingressosVendidos; }
}
