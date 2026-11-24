public class Estagiario extends Funcionario {
	
	private int horasSemanais;
	
	public Estagiario(String nome, Double salarioBase, int anoAdmissao,int horasSemanais){
		super(nome,salarioBase,anoAdmissao);
		this.horasSemanais = horasSemanais;
	}
	
	@Override
	public Double calcularSalario(){
		if(horasSemanais < 20){
			return salarioBase * 0.80;
		}
		return salarioBase;
	}
	
	public int getHorasSemanais(){
		return horasSemanais;
	}
	
	public void setHorasSemanais(int horasSemanais){
		this.horasSemanais = horasSemanais;
	}
}

