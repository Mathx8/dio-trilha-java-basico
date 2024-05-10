import java.util.Scanner;

public class SimulacaoBancaria {
    private static double saldo = 0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        escolherOperação();
    }

    public static void escolherOperação() {
        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Depositar\r\n" + //
            "2 - Sacar\r\n" + //
            "3 - Consultar Saldo\r\n" + //
            "0 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Iniciando deposito...");
                    depositar();
                    continue;
                }
                case 2: {
                    System.out.println("Inciando Saque...");
                    sacar();
                    continue;
                }
                case 3: {
                    System.out.println("Iniciando consulta de saldo...");
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
        System.out.println("Qual o valor para saque? ");
        double saque = scanner.nextDouble();
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
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
        System.out.println("Qual o valor para deposito? ");
        double valor = scanner.nextDouble();
        if (valor < 0) {
            System.out.println("Valor Inválido");
        } else {
            saldo = valor + saldo;
            System.out.println("Saldo atual: " + saldo);
        }
    }
}
