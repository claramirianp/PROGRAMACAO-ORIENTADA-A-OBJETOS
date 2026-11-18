import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		DiaDosNamorados namorados = new DiaDosNamorados("Clara");
		Natal natal = new Natal("Clara");
		Aniversario aniversario = new Aniversario("Clara");
		
		System.out.println(namorados.showMessage());
		System.out.println(natal.showMessage());
		System.out.println(aniversario.showMessage());

	}
}
