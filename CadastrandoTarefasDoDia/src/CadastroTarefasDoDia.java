import java.util.Scanner;

public class CadastroTarefasDoDia {
	public static void main(String[] args) {
		Scanner cadastroTarefas = new Scanner(System.in);
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++ ) {
			System.out.print("Tarefa " + i + ": ");
			tarefas[i] = cadastroTarefas.nextLine();
	}
		System.out.println("Suas tarefas do dia são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
	}
		cadastroTarefas.close();
	}
}
