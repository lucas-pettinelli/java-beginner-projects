import java.util.Scanner;

public class AppGerenciaBanco {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();

        separadorMenu();
        System.out.println("Bem-vindo ao Banco JavaPay");
        separadorMenu();

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scan.nextLine();

        System.out.print("Digite seu cpf: ");
        String cpf = scan.nextLine();

        if (cliente.login(nome, sobrenome, senha, cpf)) {
            System.out.println("\nLogin efetuado com sucesso!");
            exibirMenu(cliente, scan);
        }
    }

    public static void exibirMenu(Cliente cliente, Scanner scan) {
        while (true) {

            System.out.println("\nSelecione uma opção");
        
            System.out.println("1 > Consultar saldo");
            System.out.println("2 > Depositar");
            System.out.println("3 > Sacar");
            System.out.println("4 > Sair");
            separadorMenu();
            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Seu saldo é de " + cliente.consultaDesaldoCliente());
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = scan.nextDouble();
                    cliente.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    double saque = scan.nextDouble();
                    if (cliente.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scan.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void separadorMenu() {
        System.out.println("-------------------------------------------------");
    }

}

class Cliente {
    private String nome = "admin";
    private String sobrenome = "teste";
    private String senha = "123";
    private String cpf = "987654321";
    private double saldoCliente = 1000.00;

    public boolean login(String nome, String sobrenome, String senha, String cpf) {
        return this.nome.equals(nome) && this.sobrenome.equals(sobrenome) && this.senha.equals(senha)
                && this.cpf.equals(cpf);
    }

    public double consultaDesaldoCliente() {
        return saldoCliente;
    }

    public void depositar(double valor) {
        saldoCliente += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldoCliente) {
            saldoCliente -= valor;
            return true;
        }
        return false;
    }

}
