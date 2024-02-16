import java.util.Scanner;

public class NotaAluno {
	
	static final Integer NOTA_FINAL_ALUNO = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do Aluno: ");
		String nomeAluno = scanner.nextLine();

		System.out.println("Digite a sua nota: ");
		Double notaAluno = scanner.nextDouble();

		Boolean passouDeAno = notaAluno >= NOTA_FINAL_ALUNO;

		if (passouDeAno) {
			System.out.println(nomeAluno+ " " + "Parabéns você passou de ano, sua nota foi de " +notaAluno + ".");
		} else {
			System.out.println(nomeAluno+ " " + "Infelizmente você ficou de recuperação, sua nota foi de " +notaAluno + ".");
		}
		scanner.close();
	}
}