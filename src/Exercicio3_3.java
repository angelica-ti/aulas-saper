/*Fazer um programa que execute a multiplicação
de dois valores lidos. E se o resultado da
multiplicação for menor que 25, mostrar a metade do resultado.
*/

import java.util.Scanner;

public class Exercicio3_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int value1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int value2 = input.nextInt();

        int mult = value1 * value2;

        if(mult<25){
            System.out.printf("Metade do valor: %.2f", mult/2.0);
        }
    }
}
