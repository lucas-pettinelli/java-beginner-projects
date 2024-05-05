public class Robo {
    String nome;
    String cor;
    int velocidade;
    int nivelBateria;
    double peso;
    String tipoTracao;
    boolean antenas;

    public void imprimirAtributos(){
        System.err.println("Nome: " + nome);
        System.err.println("Cor: " + cor);
        System.err.println("Velocidade: " + velocidade);
        System.err.println("Bateria: " + nivelBateria);
        System.err.println("Peso: " + peso);
        System.err.println("Tipo de tração: " + tipoTracao);
        System.err.println("Antenas: " + antenas);
    }

    public static void main(String[] args) {
        Robo robo1 = new Robo();
        robo1.nome = "R-801";
        robo1.cor = "Azul";
        robo1.velocidade = 6;
        robo1.nivelBateria = 78;
        robo1.peso = 10;
        robo1.tipoTracao = "Esteira";
        robo1.antenas = true;

        Robo robo2 = new Robo();
        robo2.nome = "R-307";
        robo2.cor = "Vermelho";
        robo1.velocidade = 3;
        robo1.nivelBateria = 51;
        robo1.peso = 15;
        robo1.tipoTracao = "Esteira";
        robo1.antenas = false;

        System.out.println("O robo escolhido foi: " + robo1);
        robo1.imprimirAtributos();
    }
}
