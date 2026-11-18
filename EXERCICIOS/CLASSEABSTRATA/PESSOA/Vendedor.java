public class Vendedor extends Empregado {
	
	private Double totalDeVendas;
	private Double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto,Double totalDeVendas, Double comissao){
			super(nome, endereco, telefone,codigoSetor,salarioBase,imposto);
			this.totalDeVendas = totalDeVendas;
			this.comissao = comissao;
	}
	
	@Override
	public Double calculaSalario(){
		return (getSalarioBase() - getImposto()) + (totalDeVendas * comissao);
	}
	
	public Double getTotalDeVendas(){
		return totalDeVendas;
	}
	
	public void setTotalDeVendas(Double totalDeVendas){
		this.totalDeVendas = totalDeVendas;
	}
	
	public Double getComissao(){
		return comissao;
	}
	
	public void setComissao(Double comissao){
		this.comissao = comissao;
	}
}

