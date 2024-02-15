import java.util.Scanner;

public class Constante {
	static final Integer IDADE_MINIMA_CARTEIRA = 18;
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Idade: ");
	Integer idade = scanner.nextInt();
	
	Boolean podeTirarCarteira = idade >= IDADE_MINIMA_CARTEIRA;
	
	if(podeTirarCarteira){
		System.out.println("Autorizado para tirar carteira");
	}else {
		System.out.println("Não Autorizado para tirar carteira");
	}
	scanner.close();
	}
}