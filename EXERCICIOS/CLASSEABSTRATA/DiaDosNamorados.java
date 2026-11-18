public class DiaDosNamorados extends CartaoWeb {
	
	public DiaDosNamorados(String destinatario){
		super(destinatario);
	}
	
	@Override
	public String showMessage(){
		return "Para: " + getDestinatario() + " Feliz dia dos Namorados!";
	}
	
}

