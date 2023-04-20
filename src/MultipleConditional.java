import java.util.Scanner;

public class MultipleConditional {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int choice = input.nextInt();

        switch (choice){
            case 1 -> System.out.println("Valor 1 digitado!");
            case 2 -> System.out.println("Valor 2 digitado!");
            default -> System.out.println("Nem 1 nem 2 digitados!");
        }
    }
}
