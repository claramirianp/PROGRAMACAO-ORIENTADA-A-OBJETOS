public class Hatch extends Carro {
	
	private int bagageiro;
	
	public Hatch(int passageiros, int combustivel, float rendimento, boolean cambioAutomatico,int bagageiro){
		super(passageiros,combustivel,rendimento,cambioAutomatico);
		this.bagageiro = bagageiro;
	}
	
	public float calculaVolume(){
		if(getPassageiros() < 3 ){
			return bagageiro * 2;
		} else if(getPassageiros() == 3){
			return bagageiro * 1.5f;
		}
		return bagageiro;
	}
	
	public int getBagageiro(){
		return bagageiro;
	}
	
	public void setBagageiro(int bagageiro){
		this.bagageiro = bagageiro;
	}
}
