import java.util.Scanner;

public class Clinica{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Paciente[] pacientes = new Paciente[2];
		
		for(int i=0;i< pacientes.length;i++){
			pacientes[i] = new Paciente();
			System.out.println("Paciente " + (i+1));
			
			System.out.print("Nome: ");
			pacientes[i].nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			pacientes[i].sexo = sc.nextLine();
			
			System.out.print("Peso(kg): ");
			pacientes[i].peso = sc.nextDouble();
			
			System.out.print("Altura(m): ");
			pacientes[i].altura = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("\n--- Resultados ---");
		for(Paciente p : pacientes){
            System.out.printf("%s | %s | IMC: %.2f%n", p.nome, p.sexo, p.calcularIMC());
   		}
		sc.close();
	}
}

