/*
Fazer um programa que recebe a nota de cada aluno de uma turma. O programador deve
mostrar a média geral da turma e a quantidade de alunos com média maior ou igual a média
da turma.
*/
import java.util.Scanner;

public class ArrayAverageStudents {
    public static void main(String[] args){
        Scanner inputNumbers = new Scanner(System.in);
        Scanner inputStrings = new Scanner(System.in);
        System.out.print("Digite o número de estudantes da turma: ");
        int numberStudents = inputNumbers.nextInt();

        Student2[] students = new Student2[numberStudents];

        for(int i = 0; i < students.length; i++){
            System.out.printf("Digite o nome do aluno %d: ", i+1);
            String name = inputStrings.nextLine();

            System.out.printf("Digite a nota 1 do aluno %d: ", i+1);
            double grade1 = inputNumbers.nextDouble();

            System.out.printf("Digite a nota 2 do aluno %d: ", i+1);
            double grade2 = inputNumbers.nextDouble();

            students[i] = new Student2(name, grade1, grade2);
        }

        double[] averages = new double[numberStudents];
        double sumAverages = 0;

        for(int i = 0; i < students.length; i++){
            averages[i] = students[i].average();
            sumAverages += averages[i];
        }

        double averageTeam = sumAverages/numberStudents;
        int counter = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].average() >= averageTeam){
                System.out.printf("O %d° aluno teve a media maior que a média da turma: %.2f%n", i+1, averages[i]);
                counter++;
            }
        }

        System.out.printf("Quantidade de alunos com a média maior ou igual a média da turma: %d", counter);

    }
}
