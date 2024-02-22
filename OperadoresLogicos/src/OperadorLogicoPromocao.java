
public class OperadorLogicoPromocao {
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;

//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		// ** variavel a = true;
		// ** variavel b = false;
		// ** Resultado: false

		// ** variavel a = true;
		// ** variavel b = true;
		// ** Resultado: true

//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		// ** variavel a = false;
		// ** variavel b = true;
		// ** Resultado: true

		// ** variavel a = false;
		// ** variavel b = false;
		// ** Resultado: false

//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;

		// ** variavel a = true;
		// ** variavel b = true;
		// ** variavel c = true;
		// ** Resultado: true

		// ** variavel a = true;
		// ** variavel b = true;
		// ** variavel c = false;
		// ** Resultado: false

//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		// ** variavel a = false;
		// ** variavel b = true;
		// ** variavel c = false;
		// ** Resultado: true

//		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja);
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;

		if (aplicarDesconto) {
			System.out.println("Desconto aplicado!");
		} else {
			System.out.println("Não foi possível aplicar o desconto!");
		}
	}
}
