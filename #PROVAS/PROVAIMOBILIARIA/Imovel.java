class Imovel {
    protected String descricao;
    protected Double preco;
    protected boolean ativo;
    protected char tipo;
 
    public Imovel(Double preco, String descricao, boolean ativo) {
        this.preco = preco;
        this.descricao = descricao;
        this.ativo = ativo;
    }
 
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
    public char getTipo() { return tipo; }
 
    // Retorna o preço apenas se o imóvel estiver ativo
    public Double calculaPreco() {
        if (ativo) {
            return preco;
        }
        return 0.0;
    }
}
 
