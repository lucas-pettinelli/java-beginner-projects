import java.util.Scanner;

public class BonsMetodos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirBarrasDoMenu();

		String cursoEscolhido = receberCursoDoUsuario(scanner);
		
		imprimirBarrasDoMenu();
		
		String pagamentoEscolhido = receberFormaPagamentoDoUsuario(scanner);

		imprimirBarrasDoMenu();

		imprimirEContinuarMesmaLinha("O curso escolhido foi " + cursoEscolhido + " e o pagamento no " + pagamentoEscolhido);

		scanner.close();

	}
	
	static String receberCursoDoUsuario(Scanner scanner) {
		String[] cursos = new String[] { "Java EE", "Spring", "Java POO Avançado" };
		imprimir("Escolha um dos cursos abaixo: ");
		iterarEExibirPosicaoVetor(cursos);

		Integer cursoEscolhidoUsuario = receberIndiceValidoDoUsuario(cursos, "O curso que deseja é o: ", scanner);
		
		return cursos[cursoEscolhidoUsuario];
	}
	static String receberFormaPagamentoDoUsuario(Scanner scanner) {
		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };
		imprimir("Escolha a forma de pagamento: ");
		iterarEExibirPosicaoVetor(formasDePagamento);

		Integer pagamentoEscolhidoUsuario = receberIndiceValidoDoUsuario(formasDePagamento, "Forma de pagamento: ", scanner);
		
		return formasDePagamento[pagamentoEscolhidoUsuario];
	}

	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = receberNumeroInteiroDoUsuario("O curso que deseja é o: ", scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor);

		if (!posicaoValida) {
			encerrarCasoPosicaoSejaInvalida();
		}
		
		return posicaoEscolhida;
	}

	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimir(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}

	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		
		return valida;
	}

	static void imprimirBarrasDoMenu() {
		System.out.println("-----------------------------------------------------------------");
	}

	static void encerrarCasoPosicaoSejaInvalida() {
		System.err.println("Posição inválida!");

		System.exit(1);
	}

	// METODO
	static void iterarEExibirPosicaoVetor(String[] vetor) {
		iterarEExibirPosicaoVetor(vetor, 0);

	}

	// METODO RECURSIVO
	static void iterarEExibirPosicaoVetor(String[] vetor, Integer i) {
		imprimir("[" + i + "]" + vetor[i]);

		if (++i < vetor.length) {
			iterarEExibirPosicaoVetor(vetor, i);
		}
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void imprimirEContinuarMesmaLinha(String texto) {
		System.out.println(texto);
	}
}