class Edificacao extends Imovel {
    protected String disponibilidade; // "COMPRA" ou "LOCAÇÃO"
 
    public Edificacao(String disponibilidade, Double preco, String descricao, boolean ativo) {
        super(preco, descricao, ativo);
        this.disponibilidade = disponibilidade;
    }
 
    public String getDisponibilidade() { return disponibilidade; }
    public void setDisponibilidade(String disponibilidade) { this.disponibilidade = disponibilidade; }
 
    protected boolean isCompra() {
        return disponibilidade.equalsIgnoreCase("COMPRA");
    }
 
    @Override
    public Double calculaPreco() {
        return super.calculaPreco();
    }
}
