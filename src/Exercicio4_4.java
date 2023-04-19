/*
Faça um programa que recebe o salário de um vendedor e o
valor total das suas vendas. Se o salário for menor que R$
1500,00 e valor das vendas for maior que R$ 2000,00, o
programa deve aumentar o salário em 10% e mostrar o novo
salário. Caso contrário, o programa deve informar que não teve
aumento.
*/

import java.util.Scanner;

public class Exercicio4_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário do vendedor: ");
        double salary = input.nextDouble();

        System.out.println("Digite o total das vendas: ");
        double sales = input.nextDouble();

        if(salary<1500 && sales>2000){
//            double increase = salary*0.1;
//            salary += increase;
            salary *= 1.1;
//            System.out.printf("Aumento no salário do vendedor: R$ %.2f%n", increase);
            System.out.printf("Salário com aumento de 10%%: R$ %.2f", salary);
        }
        else{
            System.out.println("Não houve aumento!");
        }

    }
}
