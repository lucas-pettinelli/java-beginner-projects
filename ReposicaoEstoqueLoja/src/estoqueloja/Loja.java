package estoqueloja;

public class Loja {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Caderno 10 matérias";
		produto.quantidadeNoEstoque = 0;
		
		System.out.println("Necessário repor o estoque do produto " + produto.nome + "? " + eNecessarioReporOEstoque(produto));
	}
	
	static Boolean eNecessarioReporOEstoque(Produto produto) {
		if(produto.quantidadeNoEstoque < produto.QUANTIDADE_MINIMA_NO_ESTOQUE) {
			return true;
		}else {
			return false;
		}
	}
}
