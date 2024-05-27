import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File arquivo = new File("/home/boss/Downloads/poema.txt");
            Scanner scan = new Scanner(arquivo);
            System.out.println("--------------------------------------------------------------------");
            while (scan.hasNextLine()) {
                String linha = scan.nextLine();
                System.out.printf("%s%n", linha);
            }
            System.out.println("--------------------------------------------------------------------");
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.printf("Erro ao abrir o arquivo: %s%n");
            e.getMessage();
        }
        
    }
}
