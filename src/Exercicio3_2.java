import java.util.Scanner;

public class Exercicio3_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Digite a primeira nota:");
//        double grade1 = input.nextDouble();
//
//        System.out.println("Digite a segunda nota:");
//        double grade2 = input.nextDouble();
//
//        double average = (grade1 + grade2)/2.0;
//
//        System.out.printf("Média do aluno: %.2f ", average);
//
//        if(average >= 7){
//            System.out.print("Aluno aprovado");
//        }
//        else {
//            System.out.print("Aluno não aprovado");
//        }
        boolean myBoolean = true;
        System.out.printf("Mostrando um boolean: %b%n",myBoolean);
        System.out.println("Digite um booleano: ");
        boolean myBoolean2 = input.nextBoolean();
        System.out.printf("Meu booleano 2: %b",myBoolean2);
    }
}
