import java.util.Scanner;

public class Turma {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno[]alunos = new Aluno[2];
		
		for(int i=0; i<alunos.length;i++){
			alunos[i] = new  Aluno();
			System.out.print("Nome: ");
			alunos[i].nome = sc.nextLine();
			
			System.out.print("Nota 1: ");
			alunos[i].nota1 = sc.nextDouble();
			
			System.out.print("Nota 2: ");
			alunos[i].nota2 = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("\n---Resultados---");
		for(Aluno a: alunos){
			System.out.printf("Media de %s: %.2f%n", a.nome, a.media());
			System.out.println(a.resultado());
			}
			sc.close();
	}
}

