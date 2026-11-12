public class Consulta {
	
	private Paciente paciente;
	private Double valorConsulta;
	
	public Consulta(Paciente paciente, Double valorConsulta) {
	    this.paciente = paciente;
	    this.valorConsulta = valorConsulta;
	}
	
	public Double calculaPrecoFinal(){
	    if(paciente.isConvenio()){
		return valorConsulta * 0.5;
		}
		return valorConsulta;
	    }
	    
	public Paciente getPaciente() { return paciente;}
	public void setPaciente(Paciente paciente){this.paciente = paciente;}
	public Double getValorConsulta(){ return valorConsulta;}
	public void setValorConsulta(Double valorConsulta){this.valorConsulta = valorConsulta;}
}

