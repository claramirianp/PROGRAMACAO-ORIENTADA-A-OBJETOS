public class Natal extends CartaoWeb {
	
	public Natal(String destinatario){
		super(destinatario);
	}
	
	@Override
	public String showMessage(){
		return "Para: " + getDestinatario() + " Feliz Natal!";
	}
}
