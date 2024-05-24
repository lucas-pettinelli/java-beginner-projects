/*
 * O StringBuilder em Java é uma classe utilizada para criar e manipular cadeias de caracteres de forma eficiente. 
 * Diferente da classe String, que é imutável, StringBuilder permite modificar o conteúdo sem criar novos objetos, 
 * tornando operações como concatenação de strings mais rápidas e eficientes.
 */

public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        sb.append("Olá, ");
        sb.append("bom dia!");
        sb.append("\nComo você esta?");

        String resultado = sb.toString();
        System.out.println(resultado);
        System.out.println("----------------------------------------");
        // Exemplo de outras operações
        sb.insert(0, "Início: "); // Insere uma string no início
        sb.replace(18, 24, "demonstração"); // Substitui uma parte da string
        sb.delete(0, 8); // Remove uma parte da string

        // Exibe o resultado final após as operações
        String resultadoFinal = sb.toString();
        System.out.println(resultadoFinal);
    }
}
