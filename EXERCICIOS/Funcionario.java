public class Funcionario {
			
	String nome;
	Double horasTrabalhadas;
	Double valorDaHora;
	
	public Double salarioFinal(){
		Double bruto = horasTrabalhadas * valorDaHora;
		return bruto - (bruto * 0.11);
	}
	
}

