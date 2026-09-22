import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do trabalho de laboratório: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota da avaliação semestral: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota do exame final: ");
        double nota3 = sc.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        String conceito;

        if (media >= 8.0) {
            conceito = "A";
        } else if (media >= 7.0) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 5.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.printf("Média ponderada: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
    }
}
