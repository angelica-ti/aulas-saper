import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nomeInicial;
        double saldoInicial;

        System.out.println("Nome do cliente 1:");
        nomeInicial = input.nextLine();

        System.out.println("Digite o saldo do cliente 1:");
        saldoInicial = input.nextDouble();

        Account client = new Account(nomeInicial, saldoInicial);

        client.deposito(-2);

        System.out.printf("Saldo do cliente 1: %.2f%n",client.getSaldo());

        client.saque(1000.00);

        System.out.printf("Saldo do cliente 1: %.2f%n",client.getSaldo());

        client.deposito(2000.00);

        System.out.printf("Saldo do cliente 1: %.2f%n",client.getSaldo());

        client.saque(500.00);

        System.out.printf("Nome do cliente 1: %s%n",client.getName());
        System.out.printf("Saldo do cliente 1: %.2f%n",client.getSaldo());
    }
}
