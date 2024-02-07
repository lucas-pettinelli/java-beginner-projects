import java.util.Scanner;

public class CalculoImc {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o seu peso: ");
	Double peso = scanner.nextDouble();
	
	System.out.println("Digite sua altura: ");
	Double altura = scanner.nextDouble();
	
	Double resultadoImc = peso / (altura * altura);
	System.out.println("Resultado do seu imc é de " + resultadoImc);
	
	scanner.close();
	}
}