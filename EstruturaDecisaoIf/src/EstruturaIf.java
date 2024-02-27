
public class EstruturaIf {
	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPeloMenosMetadoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Sempre simplifique com uma variável antes  no seu if deixando mais enxuto e exemplificando como documentação com nesse exemplo abaixo:
		Boolean liberarEmprestimo = movimentaPeloMenosMetadoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;

		//		Exemplo mais simplifcado com a variavel acima de if
		if(liberarEmprestimo){
			System.out.print("Sim! Pode liberar o empréstimo.");
		
//		Estrutura if com a lógica dentro, mais complexa e sem declaracao de uma variável antes. 
//		if(((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura && temNomeLimpo){
//			System.out.println("Sim! Pode liberar o empréstimo.");
		}else {
			System.out.println("Não foi possível liberar o empréstimo.");
		}
	}
}
