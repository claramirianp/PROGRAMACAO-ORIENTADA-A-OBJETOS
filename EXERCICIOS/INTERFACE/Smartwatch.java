public class Smartwatch extends Eletronico implements Garantia {
	
	private boolean resistenteAgua;
	
	public Smartwatch(String marca, String modelo, Double preco, boolean resistenteAgua){
		super(marca,modelo,preco);
		this.resistenteAgua = resistenteAgua;
	}
	
	@Override
	public int tempoGarantia(){
		if(resistenteAgua){
			return 24;
		}
		return 12;
	}
	
	@Override
	public String detalhar(){
		return super.detalhar() + "\nResistente a agua: " + resistenteAgua + "\nTempo de Garantia de: " + tempoGarantia() + " meses.";
	}
	
	public boolean getResistenteAgua(){
		return resistenteAgua;
	}
	
	public void setResistenteAgua(boolean resistenteAgua){
		this.resistenteAgua = resistenteAgua;
	}
	
}

