//Superclasse
class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo um som!!");
    }

    public void dormir() {
        System.out.println("O animal está dormindo...");
    }

    // Getter and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
//Subclasse
class Gato extends Animal {
    private String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void movimentoRabo() {
        System.out.println("O gato está movimentando o rabo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia: miu meow!");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        //Criando um objeto da subclasse Gato
        Gato gato = new Gato("Vavá", 3, "Tigrado");

        //Chamando métodos da superclasse
        gato.dormir();
        gato.emitirSom();

        //Chamnado método subclasse
        gato.movimentoRabo();

        //Obter informações do gato
        System.out.println("Nome do gato: " + gato.getNome());
        System.out.println("Idade do gato: " + gato.getIdade());
        System.out.println("Raça do gato: " + gato.getRaca());

    }
}
