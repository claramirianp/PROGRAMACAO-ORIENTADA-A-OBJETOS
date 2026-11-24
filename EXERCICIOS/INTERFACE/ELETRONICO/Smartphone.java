public class Smartphone extends Eletronico implements Desconto,Garantia {
	
	private int capacidadeArmazenamento;
	
	public Smartphone(String marca, String modelo, Double preco, int capacidadeArmazenamento){
		super(marca,modelo,preco);
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	
	@Override
	public Double aplicarDesconto(Double porcentagem){
		desconto = preco * porcentagem / 100;
		return desconto;
	} 
	
	@Override
	public int tempoGarantia(){
		if(desconto > 0){
			return 	6;//produto com desconto tem garantia de 6 meses
		}
		return 12;//produto sem desconto tem garantia de 12
	}
	
	@Override
	public String detalhar(){
		return super.detalhar() + "\nArmazenamento:" + capacidadeArmazenamento + " GB" + "\nGarantia de: " + tempoGarantia() + " meses.";
	}
	
	public int getCapacidadeArmazenamento(){
		return capacidadeArmazenamento;
	}
	
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento){
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
}

