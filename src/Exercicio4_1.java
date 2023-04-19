/*Fazer um programa que execute a multiplicação
de dois valores lidos. E se o resultado da
multiplicação for menor que 25 ou maior que 50, mostrar a metade do resultado.
*/
import java.util.Scanner;

public class Exercicio4_1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int value1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int value2 = input.nextInt();

        int mult = value1 * value2;

        System.out.printf("Resultado da multiplicação %d%n",mult);

        if(mult<25 || mult>50){
            System.out.printf("Metade do resultado da multiplicação: %.2f", mult/2.0);
        }
    }

}
