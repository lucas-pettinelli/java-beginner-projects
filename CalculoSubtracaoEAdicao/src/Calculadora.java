import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Double numero01 = informeNumero(scan);

		separadorMenu();

		Integer operacao = escolhaOperacao(scan);

		separadorMenu();

		Double numero02 = informeNumero(scan);

		separadorMenu();

		Double resultado = realizarCalculo(operacao, numero01, numero02);
		
		System.out.println("O resultado é: " + resultado);

		scan.close();
	}

	static Double realizarCalculo(Integer operacao, Double numero01, Double numero02) {
		Double resultado = null;
		
		switch (operacao) {
		case 0:
			resultado = subtracao(numero01, numero02);
			break;
			
		case 1:
			resultado = adicao(numero01, numero02);
			break;
			
		default:
			System.err.println("Escolha uma opção válida!");
			System.exit(0);
		}
		
		return resultado;
	}
	
	static Double subtracao(Double numero01, Double numero02) {
		return numero01 - numero02;
	}
	
	static Double adicao(Double numero01, Double numero02) {
		return numero01 + numero02;
	}
	
	static Double informeNumero(Scanner scan) {
		System.out.println("Informe um número: ");
		return scan.nextDouble();
	}

	static Integer escolhaOperacao(Scanner scan) {
		System.out.println("ESCOLHA A OPERAÇÃO");

		String[] operacoes = new String[] { "Subtração", "Adição" };
		for (int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "]" + operacoes[i]);
		}
		System.out.println("Digite a operação: ");
		return scan.nextInt();
	}

	static void separadorMenu() {
		System.out.println("----------------------------------");
	}
}
