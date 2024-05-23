import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalendarioConsole {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ano (ex: 2024): ");
        int ano = scan.nextInt();

        System.out.print("Digite o mês (1-12): ");
        int mes = scan.nextInt();

        displayCalendario(ano, mes);

        scan.close();
    }

    private static void displayCalendario(int ano, int mes) {
        YearMonth anoMes = YearMonth.of(ano, mes);
        LocalDate primeiroDoMes = anoMes.atDay(1);
        DayOfWeek primeiroDiaDaSemana = primeiroDoMes.getDayOfWeek();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("MMM yyyy");
        String titulo = primeiroDoMes.format(formatador);
        System.out.println("\n" + titulo);
        System.out.println("Do Se Te Qu Qu Se Sa");

        int valorDoPrimeiroDia = primeiroDiaDaSemana.getValue() % 7;
        for (int i = 0; i < valorDoPrimeiroDia; i++) {
            System.out.print("   ");
        }

        int diasDoMes = anoMes.lengthOfMonth();
        for (int dia = 1; dia <= diasDoMes; dia++) {
            System.out.printf("%2d ", dia);
            if ((dia + valorDoPrimeiroDia) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
