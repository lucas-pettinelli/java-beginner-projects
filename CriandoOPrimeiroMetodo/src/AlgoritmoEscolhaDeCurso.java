import java.util.Scanner;

public class AlgoritmoEscolhaDeCurso {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirBarrasDoMenu();
		
		String[] cursos = new String[]{"Java EE", "Spring", "Java POO Avançado"};
		imprimir("Escolha um dos cursos abaixo: ");
		iterarEExibirPosicaoVetor(cursos);
		
		imprimir("O curso que deseja é o: ");
		Integer cursoEscolhidoUsuario = scanner.nextInt();
		
		Boolean posicaoValida = cursoEscolhidoUsuario >= 0 && cursoEscolhidoUsuario < cursos.length;
		
		if(!posicaoValida) {
			encerrarCasoPosicaoSejaInvalida();
		}
		
		imprimirBarrasDoMenu();
	
		String[] formasDePagamento = new String[] {"Cartão", "Boleto"};
		imprimir("Escolha a forma de pagamento: ");
		iterarEExibirPosicaoVetor(formasDePagamento);
		
		imprimir("Forma de pagamento: ");
		Integer pagamentoEscolhidoUsuario = scanner.nextInt();
		
		posicaoValida = pagamentoEscolhidoUsuario >= 0 && pagamentoEscolhidoUsuario < formasDePagamento.length;
		
		if(!posicaoValida) {
			encerrarCasoPosicaoSejaInvalida();
		}
		
		String cursoEscolhido = cursos[cursoEscolhidoUsuario];
		String pagamentoEscolhido = formasDePagamento[pagamentoEscolhidoUsuario];
		
		imprimirBarrasDoMenu();
		
		imprimirEContinuarMesmaLinha("O curso escolhido foi " + cursoEscolhido + " e o pagamento no " + pagamentoEscolhido);
		
		scanner.close();
		
	}
	static void imprimirBarrasDoMenu() {
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void encerrarCasoPosicaoSejaInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	static void iterarEExibirPosicaoVetor(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("["+ i + "]" + vetor [i]);
		}
	}
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	static void imprimirEContinuarMesmaLinha(String texto) {
		System.out.println(texto);
	}
}
