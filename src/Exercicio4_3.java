import java.util.Scanner;

public class Exercicio4_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int number = input.nextInt();

        String parImpar = "impar";
        if(number%2==0){
            parImpar = "par";
        }
        System.out.printf("Número %d é %s", number, parImpar);

    }
}
