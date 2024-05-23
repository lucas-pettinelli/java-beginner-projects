import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Exemplo taxa de conversão no dia 19 de maio 2024, 1 real = 0.20 dolares
        double taxaDeConversao = 0.20;

        System.out.println("Digite o valor em reais (BRL): ");
        double valorEmReais = scan.nextDouble();

        double valorEmDolar = valorEmReais * taxaDeConversao;

        System.out.printf("O valor  em dólares (USD) é: %.2f%n", valorEmDolar);

        scan.close();
    }
}
