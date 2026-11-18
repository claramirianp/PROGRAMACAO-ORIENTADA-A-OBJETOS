import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        if (salario < 5000) {
            double novoSalario = salario * 1.30;
            System.out.printf("Salário reajustado: %.2f%n", novoSalario);
        } else {
            System.out.println("O funcionário não tem direito ao aumento");
        }
    }
}
