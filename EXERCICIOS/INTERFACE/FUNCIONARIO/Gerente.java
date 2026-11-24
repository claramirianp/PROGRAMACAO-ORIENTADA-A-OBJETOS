public class Gerente extends Funcionario implements Bonificavel{
	
	private int numeroSubordinados;
	
	public Gerente(String nome, Double salarioBase, int anoAdmissao,int numeroSubordinados){
		super(nome,salarioBase,anoAdmissao);
		this.numeroSubordinados = numeroSubordinados;
	}
	
	@Override
	public Double calcularSalario(){
		return salarioBase + (numeroSubordinados * 200.0);
	}
	
	@Override
	public Double calcularBonus(){
		return calcularSalario() * 0.10;//10% do salario calculado
	}
	
	@Override
	public String descreverBonus(){
		return "Bonus do gerente " + nome + ": " + calcularBonus();
	}
	
	public int getNumeroSubordinados(){
		return numeroSubordinados;
	}
	
	public void setNumeroSubordinados(){
		this.numeroSubordinados = numeroSubordinados;
	}
	
}

