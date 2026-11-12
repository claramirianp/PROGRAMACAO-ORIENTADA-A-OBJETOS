public class ConsultaExame extends Consulta {
    
	private int quantidadeExames;
	
	public ConsultaExame(Paciente paciente, Double valorConsulta,int quantidadeExames) {
		super(paciente, valorConsulta);
		this.quantidadeExames = quantidadeExames;
	}
	
	@Override
	public Double calculaPrecoFinal(){
	   // return super.calculaPrecoFinal() * 50.0 * quantidadeExames;
		return super.calculaPrecoFinal() + 50.0 * quantidadeExames;
	}
    
	public int getQuantidadeExames(){return quantidadeExames;}
	public void setQuantidadeExames(){this.quantidadeExames = quantidadeExames;}
}

