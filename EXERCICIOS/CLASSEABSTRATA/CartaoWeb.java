public abstract class CartaoWeb {
	
	private String destinatario;//ATRIBUTOS
	
	public CartaoWeb(String destinatario){
		this.destinatario = destinatario;
	}//CONSTRUTOR
	
	public abstract String showMessage();//METODO
	
	public String getDestinatario(){
		return destinatario;
	}
	
	public void setDestinatario(String destinatario){
		this.destinatario = destinatario;
	}
}

