import java.util.Scanner;
public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (int i = 0; i <= limiteDiario; i++) {
            double valorSaque = scanner.nextDouble();
            double limiteRestante = limiteDiario - valorSaque;
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (limiteDiario <= valorSaque) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
        }
        scanner.close();
    }
}
