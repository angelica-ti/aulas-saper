
/*
Faça um programa que recebe do usuário o salário de todos os
20 funcionários de uma empresa. O programa deve mostrar o
gasto da empresa com o salário dos funcionários.

Modifique o programa anterior para também mostrar a média
salarial dos funcionários da empresa.
*/

import java.util.Scanner;

public class TotalCostsEmployees {
    public static void main(String[] args){
        int quantityEmployees = 2;
        Scanner inputStrings = new Scanner(System.in);
        Scanner inputDoubles = new Scanner(System.in);

        double salary, totalSalaries = 0, averageSalary;
        int i = 0;
        while(i < quantityEmployees){
            System.out.printf("--- Dados do %d° empregado ---%n", i);
            System.out.print("Digite o nome: ");
            String name = inputStrings.nextLine();

            System.out.print("Digite o sobrenome: ");
            String lastName = inputStrings.nextLine();

            System.out.print("Digite o salário: ");
            salary = inputDoubles.nextDouble();

            Employeee developer = new Employeee(name, lastName, salary);
            totalSalaries += developer.getSalary();

            i++;
        }
        System.out.printf("Gasto mensal da empresa com o salário dos funcionários: R$ %.2f%n", totalSalaries);
        averageSalary = totalSalaries/quantityEmployees;
        System.out.printf("Média salarial dos funcionários: R$ %.2f",averageSalary);
    }
}
