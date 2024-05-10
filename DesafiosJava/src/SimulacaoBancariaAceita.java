import java.util.Scanner;

public class SimulacaoBancariaAceita {
    private static double saldo = 0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        escolherOperação();
    }

    public static void escolherOperação() {
        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    depositar();
                    continue;
                }
                case 2: {
                    sacar();
                    continue;
                }
                case 3: {
                    consultarSaldo();
                    continue;
                }
                case 0: {
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            break;
        }
    }
    
    public static void consultarSaldo () {
        System.out.println("Saldo atual: " + saldo);
    }

    public static void sacar() {
        double saque = scanner.nextDouble();
        if (saque > saldo) {
            System.out.println("Saldo insuficiente.");
        }
        else if (saque < 0) {
            System.out.println("Valor inválido");
        }
        else {
            saldo = saldo - saque;
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public static void depositar() {
        double valor = scanner.nextDouble();
        if (valor < 0) {
            System.out.println("Valor Inválido");
        } else {
            saldo = valor + saldo;
            System.out.println("Saldo atual: " + saldo);
        }
    }
}
