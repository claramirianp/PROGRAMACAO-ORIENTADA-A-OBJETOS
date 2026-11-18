public class Administrador extends Empregado {
	
	private Double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone,int codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto){
		super(nome, endereco, telefone,codigoSetor,salarioBase,imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public Double calculaSalario(){
		return (getSalarioBase() - getImposto()) + ajudaDeCusto;
		}
		
	public Double getAjudaCusto(){
		return ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(Double ajudaDeCusto){
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
