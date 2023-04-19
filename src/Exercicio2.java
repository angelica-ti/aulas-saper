import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int number1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.printf("Soma: %d", sum);
    }
}
