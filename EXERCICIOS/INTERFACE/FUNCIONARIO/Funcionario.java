public abstract class Funcionario {
	
	protected String nome;
	protected Double salarioBase;
	protected int anoAdmissao;
	
	public Funcionario(String nome, Double salarioBase, int anoAdmissao){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.anoAdmissao = anoAdmissao;
	}
	
	public abstract Double calcularSalario();
	
}

