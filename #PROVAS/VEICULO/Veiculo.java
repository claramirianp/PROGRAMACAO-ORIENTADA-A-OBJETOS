public abstract class Veiculo {
	
	protected String modelo;
	protected int ano;
	protected Double consumo;
	
	public Veiculo(String modelo,int ano,Double consumo){
		this.modelo = modelo;
		this.ano = ano;
		this.consumo = consumo;
	}
	
	public abstract Double calcularCusto(Double distancia,Double precoCombustivel);	
	
}

