import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite A: ");
        double a = sc.nextDouble();
        System.out.print("Digite B: ");
        double b = sc.nextDouble();
        System.out.print("Digite C: ");
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais");
        } else {
            System.out.println("A equação possui uma única raiz real");
        }
    }
}
