import java.util.Scanner;

public class CalculoGastosFamiliar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite os valores gastos: ");
		
		Double total = 0.0;
		
		System.out.print("Conta de luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de água: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Escola do filho: ");
		total += scanner.nextDouble();
		
		System.out.print("Fatura do cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Gastos com supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O gasto total foi de: " + total);
		
		scanner.close();
	}
}
