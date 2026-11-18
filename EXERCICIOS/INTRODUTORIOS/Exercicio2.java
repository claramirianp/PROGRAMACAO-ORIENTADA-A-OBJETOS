import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}
