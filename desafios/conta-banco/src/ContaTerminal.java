import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Bem-vindo(a) ao banco Jujubas! Informe o seu nome, por favor.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Informe a sua agência: (exemplo: xxx-x)");
        String agencia = scanner.next();

        System.out.println("Qual o valor do saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}