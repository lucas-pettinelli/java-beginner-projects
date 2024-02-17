
public class ExOperadoresAritmeticos {
	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Resultado adição: " + adicao);
		
		Integer subtracao = 4 - 2;
		System.out.println("Resultado subtração: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Resultado multiplicação: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Resultado divisão: " + divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Resultado módulo: " + modulo);
	
		//** PRESEDÊNCIA DOS OPERADORES **//
		
		Integer precendencia01 = 1 + 1 * 5;
		System.out.println("Resultado presedência 01: " + precendencia01);
		
		Integer precendencia02 = (1 + 1) * 5;
		System.out.println("Resultado presedência 02: " + precendencia02);
		
		Integer precendencia03 = 5 * (1 + 1);
		System.out.println("Resultado presedência 03: " + precendencia03);
		
		Integer precendencia04 = 5 * (1+1) + 2;
		System.out.println("Resultado presedência 04: " + precendencia04);
		
		Integer precendencia05 = 5 * ((1 + 1) + 2);
		System.out.println("Resultado presedência 05: " + precendencia05);
		
		Integer cinco = 5;
		Integer um = 1;
		Integer precedenciaComVariavel = cinco * (um + um);
		System.out.println("Resultado presedência 06: " + precedenciaComVariavel);
	}
}
