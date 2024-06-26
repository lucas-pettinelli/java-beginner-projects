package lendolistadetarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraLista {
	public static void main(String[] args) throws IOException {
		List<String> linhas = lerDoArquivo("/home/boss/exercicio01/arquivo.txt");

		System.out.println("-----------------SUA LISTA DE TAREFAS-----------------");
		
		for (int i = 0; i < linhas.size(); i++) {
			String tarefas = linhas.get(i);
			System.out.println(i + ": " + tarefas);
		}
		System.out.println("------------------------------------------------------");
	}
		
	static List<String> lerDoArquivo(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
		}
	
}
