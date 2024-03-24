import java.util.Scanner;

public class Vetores1Dimensao {
	public static void main(String[] args) {
		String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto"};
		System.out.println("Escolha o sabor: ");
		
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]" + cardapio[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número referente ao sabor: ");
		Integer saborEscolhido = scanner.nextInt();
		
		System.out.println("Você escolheu o sabor: " +cardapio[saborEscolhido]);
		
		scanner.close();
	}
}

/*ALTERANDO UMA OPÇÃO DENTRO DO VETOR
 * 
	String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto"};
	cardapio[3] = "Frango";
	for(int i = 0; i < cardapio.length; i++) {
			System.out.println("[ cardapio[i]);
	
 */
 
/*ADICIONANDO ITENS AO VETOR
 	
	String[] cardapio = new String[4];
	cardapio[0] = "Frango";
	cardapio[1] = "4 Queijos";
	cardapio[2] = "Lombo com catupiry";
	cardapio[3] = "Portuguesa";
	for(int i = 0; i < cardapio.length; i++) {
			System.out.println("[ cardapio[i]);

*/