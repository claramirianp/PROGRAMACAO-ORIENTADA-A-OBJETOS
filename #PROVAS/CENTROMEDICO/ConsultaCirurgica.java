public class ConsultaCirurgica extends ConsultaEspecialista{
    
	private boolean taxaAnestesia;
	
	public ConsultaCirurgica(Paciente paciente, Double valorConsulta,boolean retornoIncluso,boolean taxaAnestesia) {
	    super(paciente, valorConsulta,retornoIncluso);
	    this.taxaAnestesia = taxaAnestesia;
	}
	
	@Override
	public Double calculaPrecoFinal(){
	    Double valor = super.calculaPrecoFinal();
	    if(taxaAnestesia){
		//valor =+ 500;
		valor += 500;
		} 
		return valor;
	    }
	    
	//public boolean getTaxaAnestesia(){ return taxaAnestesia;}
	public boolean isTaxaAnestesia(){ return taxaAnestesia;}
	public void setTaxaAnestesia(boolean taxaAnestesia){this.taxaAnestesia = taxaAnestesia;}
}

