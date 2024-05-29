import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int inicio, fim, primo = 0;

        Scanner contador = new Scanner(System.in);

        System.out.println("Número inicial: ");
        inicio = contador.nextInt();

        System.out.println("Número final: ");
        fim = contador.nextInt();

        for (int i = inicio; i <= fim; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é primo!");
            }
            primo = 0;
        }
        contador.close();
    }
}
