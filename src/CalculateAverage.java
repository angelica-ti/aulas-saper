import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args){
        Scanner inputStrings = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite a quantidade de alunos:");
        int n_students = input.nextInt();

        int i = 0;

        while(i < n_students){
            System.out.printf("---Notas do aluno %d---%n",i+1);
            System.out.print("Nome do aluno: ");
            String name = inputStrings.nextLine();

            System.out.print("Digite a nota 1: ");
            n1 = input.nextDouble();

            System.out.print("Digite a nota 2: ");
            n2 = input.nextDouble();

            double average = (n1+n2)/2.0;

            Student student = new Student(name, average);

            System.out.printf("Média: %.2f%n", student.getAverage());

            i++;
        }
    }
}
