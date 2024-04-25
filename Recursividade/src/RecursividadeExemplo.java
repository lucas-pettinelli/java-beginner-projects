import java.util.Scanner;

public class RecursividadeExemplo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirBarrasDoMenu();
		
		String[] cursos = new String[]{"Java EE", "Spring", "Java POO Avançado"};
		imprimir("Escolha um dos cursos abaixo: ");
		iterarEExibirPosicaoVetor(cursos);
		
		
		Integer cursoEscolhidoUsuario = receberNumeroInteiroDoUsuario("O curso que deseja é o: ", scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(cursoEscolhidoUsuario, cursos);
		
		if(!posicaoValida) {
			encerrarCasoPosicaoSejaInvalida();
		}
		
		imprimirBarrasDoMenu();
	
		String[] formasDePagamento = new String[] {"Cartão", "Boleto"};
		imprimir("Escolha a forma de pagamento: ");
		iterarEExibirPosicaoVetor(formasDePagamento);
		
		Integer pagamentoEscolhidoUsuario = receberNumeroInteiroDoUsuario("Forma de pagamento: ", scanner);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(pagamentoEscolhidoUsuario, formasDePagamento);  
		
		if(!posicaoValida) {
			encerrarCasoPosicaoSejaInvalida();
		}
		
		String cursoEscolhido = cursos[cursoEscolhidoUsuario];
		String pagamentoEscolhido = formasDePagamento[pagamentoEscolhidoUsuario];
		
		imprimirBarrasDoMenu();
		
		imprimirEContinuarMesmaLinha("O curso escolhido foi " + cursoEscolhido + " e o pagamento no " + pagamentoEscolhido);
		
		scanner.close();
		
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
	//METODO 
	static void iterarEExibirPosicaoVetor(String[] vetor) {
		iterarEExibirPosicaoVetor(vetor, 0);
			
	}
	//METODO RECURSIVO
	static void iterarEExibirPosicaoVetor(String[] vetor, Integer i) {
		imprimir("["+ i + "]" + vetor [i]);
		
		if(++i < vetor.length) {
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
