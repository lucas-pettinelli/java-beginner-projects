import java.util.Scanner;

public class PesoDoLutador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		Double peso = scanner.nextDouble();
// ------------------------------------------ PRIMEIRA SOLUÇÃO COM O IF ENCADEADO ---------------------------------------------------------------------
//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoMedio = (peso > 60) && (peso <= 90);
//		Boolean pesoPesado = peso > 90;
	
//		if(pesoLeve) {
//			System.out.println("O lutador(a) é peso leve.");
//		
//		}if(pesoMedio) {
//			System.out.println("O lutador(a) é peso médio.");
//		}if(pesoPesado) {
//			System.out.print("O lutador(a) tem o é peso pesado.");
//		}
//			
//		}else {
//			Boolean pesoMedio = (peso > 60) && (peso <= 90);
//			if(pesoMedio) {
//				System.out.println("O lutador(a) é peso médio.");
//			}else {
//				Boolean pesoPesado = peso > 90;
//			
//				if(pesoPesado) {
//				System.out.print("O lutador(a) tem o é peso pesado.");
//			}
//		}
//		}
		
// ------------------------------------------ SEGUNDA SOLUÇÃO COM O IF ENCADEADO ---------------------------------------------------------------------	

		Boolean pesoLeve = (peso > 0) && (peso <= 60);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso> 90;
		
		if(pesoLeve) {
			System.out.println("O lutador(a) tem o é peso leve.");
		}else if(pesoMedio){
			System.out.println("O lutador(a) tem o é peso médio.");
		}else if(pesoPesado){
			System.out.println("O lutador(a) tem o é peso pesado.");
		}else {
			System.out.println("O lutador(a) não se encaixa em nenhuma categoria.");
		}
		
		scanner.close();
	}
}
