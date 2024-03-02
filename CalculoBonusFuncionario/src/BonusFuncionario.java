import java.util.Scanner;

public class BonusFuncionario {
	public static void main(String[] args) {
		System.out.println("-------------------EMPRESA AD MATERIAIS CONSTRUÇÃO------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a meta do faturamento deste ano: ");
		Double meta = scanner.nextDouble();
		
		System.out.print("Digite o faturamento: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Digite a média salarial do funcionário(a) nos ultimos 12 meses: ");
		Double mediaSalarialFuncionario = scanner.nextDouble();
		
	
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean bateuAMeta = faturamento >= meta;
		
		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
		
		if(bateuAMeta) {
			System.out.println("Você vai ganhar um bônus de 100%! Ele será no valor de R$ " + mediaSalarialFuncionario);
		}else if(faturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (mediaSalarialFuncionario * 80) / 100;
			System.out.println("Você vai ganhar um bônus de 80%! Ele será no valor de R$ " + oitentaPorCentoDaMediaSalarial);
		}else {
			System.out.println("Infelizmente, esse ano você não recebeu o bônus.");
		}
		
		scanner.close();
		
	}
}
