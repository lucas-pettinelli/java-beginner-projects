/*Em Java, a utilização de "varargs" (argumentos variáveis) permite que você passe um número variável de argumentos para um método. 
O recurso de varargs foi introduzido no Java 5 e é particularmente útil quando não se sabe de antemão quantos argumentos serão passados para o método. */

public class VarArgsExample {

    // Método que aceita varargs
    public static void printNumbers(int... numbers) {
        // Numbers é tratado como um array dentro do método
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        // Chamando o método com diferentes números de argummentos
        printNumbers(1);
        printNumbers(1, 2, 3);
        printNumbers(4, 5, 6, 7, 8);
        printNumbers(9, 10, 11);
    }
}

/*Regras e Considerações:
- Somente um Varargs por Método: Um método pode ter no máximo um parâmetro varargs e ele deve ser o último parâmetro na lista de parâmetros do método.
- Compatibilidade com Arrays: Varargs é basicamente açúcar sintático para arrays. Você pode passar explicitamente um array para um parâmetro varargs.
- Chamada com Zero Argumentos: É possível chamar um método varargs sem passar nenhum argumento. Nesse caso, o array numbers terá tamanho zero.
 */