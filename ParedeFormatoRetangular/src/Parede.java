import java.util.Scanner;

public class Parede {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a altura da parede: ");
		Double alturaDaParede= scanner.nextDouble();
		
		System.out.print("Digite a largura da parede: ");
		Double larguraDaParede = scanner.nextDouble();
		
		System.out.print("Digite a altura do azulejo: ");
		Double alturaDoAzulejo = scanner.nextDouble();
		
		System.out.print("Digite a largura do azulejo: ");
		Double larguraDoAzulejo = scanner.nextDouble();
		
		Double quantidadeAzulejo = (alturaDaParede * larguraDaParede) / (alturaDoAzulejo * larguraDoAzulejo);
		
		System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + quantidadeAzulejo);
		
	}
}
