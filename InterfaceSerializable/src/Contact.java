import java.io.Serializable;

/*
A interface Serializable é extremamente útil para persistência de dados, comunicação entre sistemas e recuperação de estados, 
proporcionando uma maneira simples de converter objetos em um formato que pode ser armazenado e transmitido de maneira eficiente.

Exemplo - Criando uma aplicação para gerenciar uma lista de contatos, e salvando e carregando esses contatos do disco. 
Isso pode ser feito usando a interface Serializable para salvar e recuperar a lista de contatos.
 */

public class Contact implements Serializable {
    private static final long seriaVersionUID = 1L;

    public static long getSeriaversionuid() {
        return seriaVersionUID;
    }

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contato{name='" + name + "', Telefone='" + phoneNumber + "'}";
    }
}
