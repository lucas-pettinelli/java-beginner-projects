import java.util.Scanner;

public class CalcularValorTroco {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o valor do produto: ");
	Double valorProduto = scanner.nextDouble();
	
	System.out.println("Digite o valor do cliente: ");
	Double valorCliente = scanner.nextDouble();
	
	Double resultado = valorCliente - valorProduto;
	System.out.println("O seu troco é de R$ " + resultado);
}
}
