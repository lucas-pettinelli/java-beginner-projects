package estoqueprodutos;

public class Armazenamento {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
	}
}
