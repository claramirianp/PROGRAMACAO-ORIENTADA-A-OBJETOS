public class Aluno {
	
	String nome;
	Double nota1;
	Double nota2;
	
	public Double media(){
			return (nota1 + nota2) / 2;
		}
		
	public String resultado(){
		if (media() >=6){
			return nome + "-APROVADO";
			}
			return nome +"-REPROVADO";
		}
}

