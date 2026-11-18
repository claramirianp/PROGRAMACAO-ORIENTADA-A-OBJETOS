import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        int resultado = (a == b) ? 0 : Math.abs(a - b);
        System.out.println("Resultado: " + resultado);
    }
}
