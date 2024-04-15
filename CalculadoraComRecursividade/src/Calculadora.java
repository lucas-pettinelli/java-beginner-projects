import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		Integer numero = scan.nextInt();
		
		System.out.println("---------------------------------");
		
		imprimirTabuada(numero, 0);
		
		scan.close();
	}

	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}
}
