class Comercial extends Edificacao {
    private String localizacao; // "CENTRO" ou "BAIRRO"
 
    public Comercial(String localizacao, String disponibilidade, Double preco,
                     String descricao, boolean ativo) {
        super(disponibilidade, preco, descricao, ativo);
        this.localizacao = localizacao;
        this.tipo = 'C';
    }
 
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
 
    @Override
    public Double calculaPreco() {
        if (!ativo) {
            return 0.0;
        }
        double acrescimo;
        if (localizacao.equalsIgnoreCase("CENTRO")) {
            acrescimo = isCompra() ? 0.20 : 0.15;
        } else { // BAIRRO
            acrescimo = isCompra() ? 0.07 : 0.05;
        }
        return preco * (1 + acrescimo);
    }
}
