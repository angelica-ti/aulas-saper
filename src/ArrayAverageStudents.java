/*
Fazer um programa que recebe a nota de cada aluno de uma turma. O programador deve
mostrar a média geral da turma e a quantidade de alunos com média maior ou igual a média
da turma.
*/
import java.util.Scanner;

public class ArrayAverageStudents {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de estudantes da turma: ");
        int numberStudents = input.nextInt();

        double[] grades = new double[numberStudents];

        double average = 0;
        for(int i = 0; i < grades.length; i++){
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            grades[i] = input.nextDouble();
            average += grades[i];
        }

        average /= grades.length;
        System.out.printf("A média dos alunos é %.2f%n", average);

        int counter = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] >= average){
                System.out.printf("O %d° aluno teve a nota maior que a média da turma: %.2f%n", i+1, grades[i]);
                counter++;
            }
        }

        System.out.printf("Quantidade de alunos com a média maior ou igual a média da turma: %d", counter);

    }
}
