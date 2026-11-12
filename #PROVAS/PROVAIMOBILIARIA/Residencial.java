class Residencial extends Edificacao {
    private String tipoResidencia; // "CASA" ou "APARTAMENTO"
 
    public Residencial(String tipoResidencia, String disponibilidade, Double preco,
                       String descricao, boolean ativo) {
        super(disponibilidade, preco, descricao, ativo);
        this.tipoResidencia = tipoResidencia;
        this.tipo = 'R';
    }
 
    public String getTipoResidencia() { return tipoResidencia; }
    public void setTipoResidencia(String tipoResidencia) { this.tipoResidencia = tipoResidencia; }
 
    @Override
    public Double calculaPreco() {
        if (!ativo) {
            return 0.0;
        }
        double acrescimo;
        if (tipoResidencia.equalsIgnoreCase("CASA")) {
            acrescimo = isCompra() ? 0.05 : 0.10;
        } else { // APARTAMENTO
            acrescimo = isCompra() ? 0.03 : 0.15;
        }
        return preco * (1 + acrescimo);
    }
}
