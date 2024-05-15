/*
 O tratamento de exceções em Java é fundamental para construir programas robustos e confiáveis. 
 Vamos explorar um exemplo básico e um exemplo mais complexo para demonstrar como lidar com exceções.

 Exemplo - Programa simples que lida com a tentativa de divisão por zero, o que gera uma ArithmeticException.
 */

public class App {
    public static void main(String[] args) throws Exception {
        // Bloco Try gerando uma exceção.
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) { // Capturamos e trataremos a execção, capturando 'ArithmeticException'.
            System.out.println("Erro: A divisão por zero não é permitida");
        } finally { // Executa independentemente de uma exceção ter sido lançada ou não.
            System.out.println("Execução finalizada");
        }

    }
}
