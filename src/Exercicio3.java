/*Uma empresa corta barras de aço em pedaços de tamanhos iguais. Construa um programa em que o usuário digita o tamanho da barra
* de aço e o programa mostra o que sobra da barra de aço depois de cortá-la em pedaços de 5m até não ser mais possível.*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da barra de aço:");
        double barradeaco = input.nextDouble();
        System.out.println("Digite o quantidade de divisões da barra:");
        int qtdDivisoes = input.nextInt();
        double sobra = barradeaco%qtdDivisoes;
        System.out.printf("Sobra da barra de %f m após dividí-la em %d partes iguais = %.2f m", barradeaco, qtdDivisoes, sobra);
    }
}
