public class Moto extends Veiculo implements Seguro {
	
	private boolean partidaEletrica;
	
	public Moto(String modelo,int ano,Double consumo,boolean partidaEletrica){
		super(modelo,ano,consumo);
		this.partidaEletrica = partidaEletrica;
	}
	
	@Override
	public Double calcularCusto(Double distancia, Double precoCombustivel){
		if(!partidaEletrica){//se a moto nao possuir partida eletrica o custo aumenta em 5%
			return ((distancia / consumo) * precoCombustivel) * 1.05;
		}
		return (distancia / consumo) * precoCombustivel;
	}
	
	@Override
	public Double calcularPremioSeguro(){
		return 800.0 + (2025 - ano) * 30.0;
	}
	
	@Override
	public String renovarSeguro(){
		return  "Seguro da moto " + modelo + " renovado com sucesso!";
	}
	
	public boolean getPartidaEletrica(){
		return partidaEletrica;
	}
	
	public void setPartidaEletrica(boolean partidaEletrica){
		this.partidaEletrica = partidaEletrica;
	}
	
}

