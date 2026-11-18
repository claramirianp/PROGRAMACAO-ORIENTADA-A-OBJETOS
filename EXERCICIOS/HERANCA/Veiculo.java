public class Veiculo {
	
	protected int passageiros;
	protected int combustivel;
	protected float rendimento;
	
	public Veiculo(int passageiros, int combustivel, float rendimento){
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.rendimento = rendimento;
	}
	
	public float autonomia(){
		return (combustivel * rendimento);
	}
	
	public int getPassageiros(){
		return passageiros;
	}
	
	public void setPassageiros(int passageiros){
		this.passageiros = passageiros;
	}
	
	public int getCombustivel(){
		return combustivel;
	}
	
	public void setCombustivel(int combustivel){
		this.combustivel = combustivel;
	}
	
	public float getRendimento(){
		return rendimento;
	}
	
	public void setRendimento(float rendimento){
		this.rendimento = rendimento;
	}
}
