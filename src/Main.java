import java.util.Scanner;

/*João consegue terminar uma corrida com percurso de 1260 metros em 4 min. Faça um programa para mostrar a velocidade
média de Joãoem metros por segund*/
public class Main {
    public static void main(String[] args) {
//        Account client2 = new Account();
//        System.out.printf("Nome do cliente: %s%n", client.getName());
//        System.out.printf("Saldo do cliente: %.2f%n",client.getSaldo());

        //Aula 6
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

//        input.nextLine();
//
//        System.out.println("Nome do cliente 2:");
//        client2.setName(input.nextLine());
//
//        System.out.println("Digite o saldo do cliente 2:");
//        client2.setSaldo(input.nextDouble());
//
//        System.out.printf("Nome do cliente 2: %s%n",client2.getName());
//        System.out.printf("Saldo do cliente 2: %.2f",client2.getSaldo());

//        client.setSalario(4500.00);
//        System.out.printf("Salario : %.2f%n", client.getSalario());
//        client.aumento10();
//        System.out.printf("Novo Salário : %.2f", client.getSalario());
//        float distance = 1260, timeMinutes = 4, timeSeconds, velocity;
//        timeSeconds = timeMinutes*60;
//        velocity = distance/timeSeconds;
//        System.out.printf("Velocidade média do João %.2f m/s%n", velocity);
//        System.out.printf("Velocidade média do João %.2f m/s%n", 1260.0/(4*60));
//        System.out.printf("Velocidade média do João %.2f km/h", (1260.0/1000)/(4.0/60));
    }
}