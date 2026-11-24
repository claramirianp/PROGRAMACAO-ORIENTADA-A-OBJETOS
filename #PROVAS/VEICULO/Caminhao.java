public class Caminhao extends Veiculo implements Manutencao{
	
	private int carga;
	
	public Caminhao(String modelo,int ano,Double consumo,int carga){
		super(modelo,ano,consumo);
		this.carga = carga;
	}
	
	@Override
	public Double calcularCusto(Double distancia,Double precoCombustivel){
		return (distancia / consumo) * precoCombustivel;
	}
	
	@Override
	public Double custoManutencao(){
		return 1500.0 + (100.0 * (2025 - ano));
	}
	
	@Override
	public boolean precisaManutencao(int kmRodados){
		return kmRodados > 20000;
	}
	
	public int getCarga(){
		return carga;
	}
	
	public void setCarga(int carga){
		this.carga = carga;
	}
}

