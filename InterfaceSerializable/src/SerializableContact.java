import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Cenário do Mundo Real
Persistência de Dados: Você pode salvar a lista de contatos em um arquivo e recuperá-la posteriormente, 
permitindo que a aplicação retome de onde parou sem perder dados.
Portabilidade: Os contatos serializados podem ser facilmente transmitidos pela rede ou armazenados para backup.
Simplicidade: A serialização e desserialização permitem armazenar e recuperar objetos complexos com suas relações intactas de forma simples e eficaz.

Exemplo - Serializa uma lista de contatos e a salva em um arquivo.
*/

public class SerializableContact {
    public static void main(String[] args) {

        // Cria lista de contatos e preenchemos com alguns contatos
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "123-456-7890"));
        contacts.add(new Contact("Jane Smith", "098-765-4321"));

        // Serializa a lista em um arquivo chamado contacts.ser
        try (FileOutputStream fileOut = new FileOutputStream("contacts.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(contacts);
            System.out.println("Contatos foram serializados para contacts.ser");
        } catch (Exception i) {
            i.printStackTrace();
        }
    }
}
