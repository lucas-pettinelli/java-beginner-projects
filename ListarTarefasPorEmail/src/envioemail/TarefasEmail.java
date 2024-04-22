package envioemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class TarefasEmail {
	
	public static void main(String[] args) throws EmailException {
		Carteiro.enviar("alexandre.afonso@algaworks.com",
				"Envio de email com commons email", 
				"Se estiver vendo esse email é porque o nosso envio funcionou!");
		
		System.out.println("Fim...");
	}

}
