import java.util.Scanner;

public class NotaCandidato {
	static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VERIFICADOR DE NOTA DO CANDIDATO PARA CONCURSO");
		
		System.out.print("Digite sua nota de português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite sua nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoPortugues = notaPortugues >= NOTA_MINIMA;
		Boolean estaAcimaDoMinimoMatematica = notaMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaPortugues + notaMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoMatematica && estaAcimaDoMinimoPortugues;
		
		if(passou) {
			System.out.println("Parabéns! Você passou.");
		}else {
			System.out.println("Infelizmente, não foi dessa vez.");
		}
		scanner.close();
	}
}
