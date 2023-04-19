import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do chefe:");
        String name1 = input.nextLine();
        System.out.println("Digite o sobrenome do chefe:");
        String lastName1 = input.nextLine();
        System.out.println("Digite o nome do gerente");
        String name2 = input.nextLine();
        System.out.println("Digite o sobrenome do gerente");
        String lastName2 = input.nextLine();

        Employeee boss = new Employeee(name1,lastName1, 12000.00);
        Employeee manager = new Employeee(name2,lastName2, 4000.00);

        System.out.println("----Dados dos Empregados----");
        System.out.printf("Salário anual de %s %s é %.2f%n", boss.getName(), boss.getLastName(), boss.getAnnualSalary());
        System.out.printf("Salário anual de %s %s é %.2f%n", manager.getName(), manager.getLastName(), manager.getAnnualSalary());

        System.out.println("----Aumentando no salário dosempregados----");

        System.out.println("Aumentanto o salário do empregado 1");
        boss.increaseSalary(10);

        System.out.println("Aumentando o salário do empregado 2");
        manager.increaseSalary(10);

        System.out.println("----Dados dos Empregados----");
        System.out.printf("Salário anual de %s %s é %.2f%n", boss.getName(), boss.getLastName(), boss.getAnnualSalary());
        System.out.printf("Salário anual de %s %s é %.2f%n", manager.getName(), manager.getLastName(),manager.getAnnualSalary());


    }
}
