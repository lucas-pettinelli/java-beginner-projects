package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {
	public static void main(String[] args) throws EmailException {
		Carteiro.enviar("profsol1202@outlook.com", "Envio de email com commons email",
				"Se estiver vendo esse email é porque o nosso envio funcionou!");
		System.out.println("Enviado!");
	}

}
