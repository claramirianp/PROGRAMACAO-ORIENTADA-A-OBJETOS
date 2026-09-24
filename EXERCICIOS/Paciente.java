public class Paciente {
	
	String nome;
	String sexo;
	Double peso;
	Double altura;
	
	public Double calcularIMC(){
		return peso / (altura * altura);
	}

}

