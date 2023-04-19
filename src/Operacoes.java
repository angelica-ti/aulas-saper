import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args){
        System.out.println(7%3);
        System.out.println(Math.pow(2,3));

        char myChar;
        String myString;
        double valor;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        myChar = input.nextLine().charAt(0);

        System.out.println("Digite uma string: ");
        myString = input.nextLine();

        System.out.println("Digite um double: ");
        valor = input.nextDouble();

        System.out.printf("myChar: %c%n", myChar);
        System.out.printf("myString: %s%n", myString);
        System.out.printf("Digite um double: %f", valor);


    }
}
