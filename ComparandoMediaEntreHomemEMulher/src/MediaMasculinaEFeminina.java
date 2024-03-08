import java.util.Scanner;

public class MediaMasculinaEFeminina {
	public static void main(String[] args) {
		int sexo, quantidadeFeminina = 0, quantidadeMasculina = 0;
		float altura, soma = 0, mediaMasculina = 0, maiorAltura = 0, menorAltura = 10;

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Escolha o sexo: [1] Feminino - [2] Masculino");
			sexo = scanner.nextInt();

			System.out.print("Digite a altura: ");
			altura = scanner.nextFloat();
			if (sexo == 1) {
				quantidadeFeminina++;
			} else if (sexo == 2) {
				quantidadeMasculina++;
				soma = soma + altura;
			} else {
				System.err.println("Número inválido!");
			}
			calculandoAMedia(altura, menorAltura, maiorAltura);
		}
		mediaMasculina = soma / quantidadeMasculina;

		System.out.println("A maior altura do grupo é de " + maiorAltura + " mt, e a menor é de " + menorAltura + " mt.");
		System.out.println("A média de altura dos homens é " + mediaMasculina + " mt.");
		System.out.println("O número de mulheres é " + quantidadeFeminina);

		scanner.close();
	}
	
	static void calculandoAMedia(float altura, float menorAltura, float maiorAltura) {
		if (altura > maiorAltura) {
			maiorAltura = altura;
			
		} else if (altura < menorAltura) {
			menorAltura = altura;
		}
	}

}
