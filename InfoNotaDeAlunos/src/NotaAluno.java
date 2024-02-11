import java.util.Scanner;

public class NotaAluno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do Aluno: ");
		String nomeAluno = scanner.nextLine();

		System.out.println("Digite a sua nota: ");
		Double notaAluno = scanner.nextDouble();

		Boolean passouDeAno = notaAluno >= 70;

		if (passouDeAno) {
			System.out.println(nomeAluno+ " " + "Parabéns você passou de ano, sua nota foi de " +notaAluno + ".");
		} else {
			System.out.println(nomeAluno+ " " + "Infelizmente você ficou de recuperação, sua nota foi de " +notaAluno + ".");
		}
		scanner.close();
	}
}
