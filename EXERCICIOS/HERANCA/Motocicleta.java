public class Motocicleta extends Veiculo {
	
	private int cilindrada;
	
	public Motocicleta(	int passageiros, int combustivel, float rendimento,int cilindrada){
		super(passageiros,combustivel,rendimento);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public float autonomia(){
		if (getPassageiros() <= 0) {
			return super.autonomia();
		}
		return super.autonomia() / getPassageiros();
	}
	
	public int getCilindrada(){
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada){
		this.cilindrada = cilindrada;
	}
}
