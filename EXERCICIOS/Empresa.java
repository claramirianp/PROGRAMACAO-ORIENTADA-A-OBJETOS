import java.util.Scanner;

public class Empresa {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario[] funcionarios = new Funcionario[3];
		
		for (int i=0;i< funcionarios.length;i++){
			funcionarios[i] = new Funcionario();
			System.out.println("Funcionario "+ (i+1));
			
			System.out.print("Nome: ");
			funcionarios[i].nome = sc.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			funcionarios[i].horasTrabalhadas = sc.nextDouble();
			
			System.out.print("Valor da Hora: ");
			funcionarios[i].valorDaHora = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("\n---Salarios finais ---");
		for(Funcionario f : funcionarios){
            System.out.printf("%s: R$ %.2f%n", f.nome, f.salarioFinal());			
            }
            sc.close();
	}
}

