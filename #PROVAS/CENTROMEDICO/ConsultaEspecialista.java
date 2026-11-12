public class ConsultaEspecialista extends Consulta {
    
	private boolean retornoIncluso;
	
	public ConsultaEspecialista(Paciente paciente, Double valorConsulta,boolean retornoIncluso) {
		super(paciente, valorConsulta);
		this.retornoIncluso = retornoIncluso;
	}
	
	@Override
	public Double calculaPrecoFinal(){
	    Double valor = super.calculaPrecoFinal();
	    if(retornoIncluso){
		//valor =+ 1.2;
		 valor *= 1.2;
		}
		return valor;
	    }
	    
	public boolean getRetornoIncluso(){return retornoIncluso;}
	public void setRetornoIncluso(boolean retornoIncluso){this.retornoIncluso = retornoIncluso;}    
}

