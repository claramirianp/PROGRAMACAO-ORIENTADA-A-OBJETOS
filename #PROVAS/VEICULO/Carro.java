public class Carro extends Veiculo implements Seguro,Manutencao {
	
	private boolean arCondicionado;
	
	public Carro(String modelo,int ano,Double consumo,boolean arCondicionado){
		super(modelo,ano,consumo);
		this.arCondicionado = arCondicionado;
	}
	
	@Override
	public Double calcularCusto(Double distancia, Double precoCombustivel){
		if(arCondicionado){//Se o carro possuir ar condicionado o custo aumenta em 10%
			return ((distancia / consumo) * precoCombustivel) * 1.10;
		}
		return (distancia / consumo) * precoCombustivel;
	}
	
	@Override
	public Double custoManutencao(){
		return 500.0 + (50.0 * (2025 - ano));
	}
	
	@Override
	public boolean precisaManutencao(int kmRodados){
		return kmRodados > 10000;
	}
	
	@Override
	public Double calcularPremioSeguro(){
		return 2000.0 + (2025 - ano) * 50.0;
	}
	
	@Override
	public String renovarSeguro(){
		return "Seguro do carro " + modelo + " renovado com sucesso!"; 
	}
	
	public boolean getArCondicionado(){
		return arCondicionado;
	}
	
	public void setArCondicionado(boolean arCondicionado){
		this.arCondicionado = arCondicionado;
	}
	
}
