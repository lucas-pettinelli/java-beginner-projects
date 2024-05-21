import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
 Exemplo - Desserializa a lista de contatos do arquivo e a exibe.
 */

public class DeserializeContacts {

    // Lê a lista de contatos do arquivo (contacts.ser) usando ObjectInputStream.
    public static void main(String[] args) {
        List<Contact> contacts = null;

        // Conversão da Lista de volta para instância de List<COntato> e exibição
        try (FileInputStream fileIn = new FileInputStream("contacts.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            contacts = (List<Contact>) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Contact class not found");
            c.printStackTrace();
        }

        if (contacts != null) {
            System.out.println("Deserialized Contacts...");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
