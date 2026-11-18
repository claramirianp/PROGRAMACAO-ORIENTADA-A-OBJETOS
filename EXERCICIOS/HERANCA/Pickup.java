public class Pickup extends Carro {
	
	private int capacidadeCarga;
	private int pesoCarga;
	
	public Pickup(int passageiros, int combustivel, float rendimento, boolean cambioAutomatico,int capacidadeCarga,int pesoCarga){
		super(passageiros,combustivel,rendimento, cambioAutomatico);
		this.capacidadeCarga = capacidadeCarga;
		this.pesoCarga = 0;
		setPesoCarga(pesoCarga);
	}
	
	@Override
	public float autonomia(){
		if(pesoCarga <= 0){
			return super.autonomia();
		}
		 if(pesoCarga >= capacidadeCarga){
			return super.autonomia() / 2;
		}
		return super.autonomia() * 0.75f;
	}
	
	public int getCapacidadeCarga(){
		return capacidadeCarga;
	}
	
	public boolean setCapacidadeCarga(int capacidadeCarga) {
		if (capacidadeCarga < pesoCarga) {
			return false;
		}
		this.capacidadeCarga = capacidadeCarga;
		return true;
	}
	
	public int getPesoCarga(){
		return pesoCarga;
	}
	
	public boolean setPesoCarga(int pesoCarga){
		if (pesoCarga < 0 || pesoCarga > capacidadeCarga) {
			return false;
		}
		this.pesoCarga = pesoCarga;
		return true;
	}
}
