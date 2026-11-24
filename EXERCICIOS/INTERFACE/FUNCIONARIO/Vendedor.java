public class Vendedor extends Funcionario implements Bonificavel {
	
	private Double totalVendas;
	
	public Vendedor(String nome, Double salarioBase, int anoAdmissao,Double totalVendas){
		super(nome,salarioBase,anoAdmissao);
		this.totalVendas = totalVendas;
	}
	
	@Override
	public Double calcularSalario(){
		return salarioBase + (totalVendas * 0.05);
	}
	
	@Override
	public Double calcularBonus(){
		if(totalVendas > 10000.0){
			return 500.0;
		}
		return 0.0;
	}
	
	@Override
	public String descreverBonus(){
		return "Bonus do vendedor " + nome + ": " + calcularBonus();
	}
	
}

