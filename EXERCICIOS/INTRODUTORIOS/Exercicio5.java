import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        System.out.println("Valores divisíveis por 2 e 3:");
        for (int v : valores) {
            if (v % 2 == 0 && v % 3 == 0) {
                System.out.println(v);
            }
        }
    }
}
