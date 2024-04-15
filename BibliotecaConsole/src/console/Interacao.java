package console;

import java.util.Scanner;

public class Interacao {
	public static void main(String[] args) {
		
		
	}
	Scanner scan = new Scanner(System.in);
	
	public Integer lerNumero(String texto) {
		System.out.println(texto);
		return scan.nextInt();
	}
	
	public Double lerDecimal(Double texto) {
		System.out.println(texto);
		return scan.nextDouble();
	}
	
	public String lerLinha(String texto) {
		return scan.nextLine();
	}
	
	public void fechar() {
		scan.close();
	}
	
	public void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public void erro(String texto) {
		System.err.println(texto);
	}
}
