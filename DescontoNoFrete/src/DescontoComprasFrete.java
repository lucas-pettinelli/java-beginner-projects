import java.util.Scanner;

public class DescontoComprasFrete {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o valor do produto: ");
	Double valorProduto = scanner.nextDouble();
	
	Boolean entregaFrete = valorProduto < 100;
	Double valorFinal = valorProduto;
	
	if(entregaFrete) {
		valorFinal += 15.0;
	}
	System.out.print("Sua compra ficou no valor de: R$ " + valorFinal);
	scanner.close();
	}
}
