package listatarefas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Tarefas {

	public static void main(String[] args) throws IOException, EmailException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while (true) { // O true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
			System.out.print("Tarefa " + i + ": ");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break; // Maneira de parar laço.
			}

			linhas.add(tarefa);
			i++;
		}

		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n"; 
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;

		System.out.print("Digite seu e-mail: ");
		String para = scanner.next(); 
				
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		System.out.println("Fim...");
		
		scanner.close();
	}
}