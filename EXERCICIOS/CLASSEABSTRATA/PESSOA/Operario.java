public class Operario extends Empregado {
	
	private Double valorDeProducao;
	private Double comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto,Double valorDeProducao, Double comissao){
		super(nome, endereco, telefone,codigoSetor,salarioBase,imposto);
		this.valorDeProducao = valorDeProducao;
		this.comissao = comissao;
	}
	
	@Override
	public Double calculaSalario(){
		return (getSalarioBase() - getImposto()) + (valorDeProducao * comissao);
	}
	
	public Double getValorDeProducao(){
		return valorDeProducao;
	}
	
	public void setValorDeProducao(Double valorDeProducao){
		this.valorDeProducao = valorDeProducao;
	}
	
	public Double getComissao(){
		return comissao;
	}
	
	public void setComissao(Double comissao){
		this.comissao = comissao;
	}
}

