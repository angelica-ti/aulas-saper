import java.util.Scanner;

public class Repetition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int number = input.nextInt();

        while(number <= 20){
            number = number + 2;
        }

        System.out.printf("Número %d", number);
    }
}
