package encapsulamento;

public class Encapsulamento {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setTelefone("01234567");
		
		System.out.println("Nome Cliente: " + cliente.getNome());
	}
}
