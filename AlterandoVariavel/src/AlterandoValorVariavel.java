import java.util.Scanner;

public class AlterandoValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidadeProduto;	
		
		Boolean quantidadeMaiorOuIgualDez =  quantidadeProduto >= 10;	
		Double descontoPercentual = 0.0;
		
		if(quantidadeMaiorOuIgualDez) {
			descontoPercentual = 10.0;
		}
		
		Double desconto = subtotal * descontoPercentual / 100;
		
		Double valorTotalDesconto = subtotal - desconto;
		System.out.println("Valor total= " +valorTotalDesconto);
		
	
		scanner.close();
	}
}
