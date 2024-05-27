/*
 * O StringBuffer em Java é semelhante ao StringBuilder, com a principal diferença sendo que o StringBuffer é sincronizado e,
 *  portanto, seguro para uso em ambientes multithread. No entanto, isso torna o StringBuffer um pouco mais lento que o StringBuilder 
 * em operações de string quando a sincronização não é necessária.
 */

public class App {
    public static void main(String[] args) throws Exception {
        StringBuffer sbf = new StringBuffer();

        sbf.append("Olá, ");
        sbf.append("mundo!");
        sbf.append(" Este é um exemplo de ");
        sbf.append("uso do StringBuffer em Java.");

        String resultado = sbf.toString();
        System.out.println(resultado);

        System.out.println("---------------------------");

        // Exemplo de outras operações
        sbf.insert(0, "Início: "); // Insere uma string no início
        sbf.replace(18, 24, "demonstração"); // Substitui uma parte da string
        sbf.delete(0, 8); // Remove uma parte da string

        String resultadoFinal = sbf.toString();
        System.out.println(resultadoFinal);
    }
}
