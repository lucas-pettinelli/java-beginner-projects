import java.util.Scanner;

public class ConsoleNomeCompleto {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
	String nome = scanner.nextLine();
	
	System.out.println("Digite seu sobrenome" );
	String sobrenome = scanner.nextLine();
	
	System.out.println("Seja Bem vindo: " + nome + " " + sobrenome);
	
	scanner.close();
	}
}