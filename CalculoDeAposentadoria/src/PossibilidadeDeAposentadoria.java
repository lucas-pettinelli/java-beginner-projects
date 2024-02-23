import java.util.Scanner;

public class PossibilidadeDeAposentadoria {
	static final Integer IDADE_MINIMA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Digite o seu tempo de contribuição: ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean tempoIdadeAposentadoria = idade >= IDADE_MINIMA_APOSENTAR;
		Boolean tempoContribuicao = contribuicao >= TEMPO_MINIMO_CONTRIBUICAO;
		
		Boolean aposentadoriaAutorizada = tempoIdadeAposentadoria && tempoContribuicao ;
		
		if(aposentadoriaAutorizada) {
			System.out.println("Parabéns, sua aposentadoria foi autorizada!");
		}else {
			System.out.println("Desculpe, não foi possível se aposentar agora.");
		}
		scanner.close();
	}
}
