
public class CarteiraHabilitacao {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		Boolean variavelFalsa = false;

		System.out.println("------------------------------------");
	
		Integer idade = 17;
		Boolean habilitacaoAutorizada = idade >=18;
		
		if(habilitacaoAutorizada) {
		System.out.println("Você cumpriu com os requisitos"+ " " +variavelVerdadeira);

		}else {
			System.out.println("Você não cumpriu com os requisitos"+ " " +variavelFalsa);
		}
	}
}