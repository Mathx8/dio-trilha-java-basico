import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta!");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        String vazia = scanner.nextLine(); // Para nome aceitar espaço tive que criar uma variavel vazia com nextLine

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, informe o valor de depósito!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}
