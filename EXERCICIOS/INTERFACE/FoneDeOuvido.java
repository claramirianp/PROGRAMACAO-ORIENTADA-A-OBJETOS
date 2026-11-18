public class FoneDeOuvido extends Eletronico implements Desconto {
	
	private String tipoConexao;
	
	public FoneDeOuvido(String marca, String modelo, Double preco, String tipoConexao){
			super(marca,modelo,preco);
			this.tipoConexao = tipoConexao;
	}
	
	@Override
	public Double aplicarDesconto(Double porcentagem){
		desconto = preco * porcentagem / 100;
		return desconto;
	}
	
	@Override
	public String detalhar(){
		return super.detalhar() + "\nTipo de conexao: " + tipoConexao;
	}
 
	public String getTipoConexao(){
		return tipoConexao;
	}
	
	public void setTipoConexao(String tipoConexao){
		this.tipoConexao = tipoConexao;
	}
}

