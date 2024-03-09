import java.util.Scanner;

public class Temperaturas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura em graus Celsius: ");
		Double celsius = scanner.nextDouble();
		
		Double kelvin = celsius + 273.15;
		Double fahrenheit = celsius * 1.8 + 32;
		Double reaumur = celsius * 0.8;
		Double rankine = celsius * 1.8 + 32 +  459.67;
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		System.out.println("A temperatura em Kelvin é: " + kelvin);
		System.out.println("A temperatura em Réaumur é: " + reaumur);
		System.out.println("A temperatura em Rankine é: " + rankine);
	}
}
