import java.util.Scanner;

public class CalculandoQuadradoDoNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");

		Integer numero = scanner.nextInt();
		Integer quadrado = numero * numero;

		System.out.println("O cálculo do quadrado é: " + numero + " é " + quadrado + ".");
		scanner.close();
	}

}
