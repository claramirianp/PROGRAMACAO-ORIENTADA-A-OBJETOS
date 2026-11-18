import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        int maior = Math.max(a, Math.max(b, c));
        System.out.println("O maior valor é: " + maior);
    }
}
