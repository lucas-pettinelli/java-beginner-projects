import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) throws Exception {
        Scanner scanValor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanValor.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número digitado é par.");
        }else{
            System.out.println("O número digitado é impar.");
        }
        scanValor.close();
    }
}
