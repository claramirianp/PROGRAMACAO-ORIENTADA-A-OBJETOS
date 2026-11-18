public abstract class Eletronico  {
	
	protected String marca;
	protected String modelo;
	protected Double preco;
	protected Double desconto;
	
	public Eletronico(String marca, String modelo, Double preco){
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.desconto = 0.0;
	}
	
	//metodo concreto: possui implementacao
	public Double precoFinal(){
		if(desconto > 0){
			return preco - desconto;
		}
		return preco;
	}
	
	public String detalhar() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPreço: R$ " + preco + "\nPreço final: R$ " + precoFinal();
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public Double getPreco(){
		return preco;
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
}

