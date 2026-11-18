public class Carro extends Veiculo {
	
	protected boolean cambioAutomatico;
	
	public Carro(int passageiros, int combustivel, float rendimento, boolean cambioAutomatico){
		super(passageiros,combustivel,rendimento);
		this.cambioAutomatico = cambioAutomatico;
	}
	
	@Override
	public float autonomia(){
		if (cambioAutomatico) {
			return super.autonomia() * 0.75f;
		}
		return super.autonomia();
	}
	
	public boolean isCambioAutomatico(){
		return cambioAutomatico;
	}
	
	public void setCambioAutomatico(boolean cambioAutomatico){
		this.cambioAutomatico = cambioAutomatico;
	}
}

