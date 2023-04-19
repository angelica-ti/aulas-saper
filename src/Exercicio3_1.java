/*Escreva um programa para aumentar em 10% o salário do
funcionário Carlos. O usuário deve digitar o salário do Carlos e o
programa deve mostrar o novo salário e o valor do aumento em
reais.*/

import java.util.Scanner;

public class Exercicio3_1 {
    public static void main(String[] args){
        double salario, perc_aumento;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário do Carlos:");
        salario = input.nextDouble();
        System.out.println("Digite o percentual de aumento:");
        perc_aumento = input.nextDouble();
        perc_aumento /= 100;
        double aumento = salario * perc_aumento;
        salario += aumento;
        System.out.printf("Novo salário de Carlos: R$ %.2f%n", salario);
        System.out.printf("Valor do aumento no salário: R$ %.2f", aumento);
    }
}
