package metodoinstancia;

public class MetodoInstanciaExemplo {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Lucas";
		cliente.ultimeNome = "Santos";
		cliente.telefone = "0123456789";
		cliente.email = "lucas-santos@email.com.br";
		
		System.out.println("Nome cliente: " + obterNomeCompletoCliente(cliente));
				
	
		}
	static String obterNomeCompletoCliente(Cliente cliente) {
		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimeNome;
		
		return nomeCompleto;
	}
}
