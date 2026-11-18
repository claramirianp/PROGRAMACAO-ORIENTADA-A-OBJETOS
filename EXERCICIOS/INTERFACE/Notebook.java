public class Notebook extends Eletronico implements Desconto,Garantia {
	
	private String processador;
	
	public Notebook(String marca, String modelo, Double preco, String processador){
		super(marca,modelo,preco);
		this.processador = processador;
	}
	
	@Override
	public Double aplicarDesconto(Double porcentagem){
		desconto = preco * porcentagem / 100;
		return desconto;
	}
	
	@Override
	public int tempoGarantia(){
		if(desconto > 0){
			return 	6;
		}
		return 12;
	}
	
	@Override
	public String detalhar(){
		return super.detalhar() + "\nProcessador: " + processador + "\nGarantia de: " + tempoGarantia() + " meses.";
	}
	
	public String getProcessador(){
		return processador;
	}
	
	public void setProcessador(String processador){
		this.processador = processador;
	}
}

