import java.util.Arrays;

public class GradeBookTest {
    public static void main(String[] args){
        GradeBook gradeBook = new GradeBook("Lógica de Programação", new double[] {8.0, 0.5, 10.0, 9.5, 2.4, 7.3, 6.2, 6.8, 8.7, 8.9});

        //Retornando todas as notas
        System.out.println("Retornando todas as notas: ");
        System.out.println(Arrays.toString(gradeBook.getGrades()));

        //Retornando uma nota específica
        System.out.println("Retornando uma nota específica: ");
        System.out.println(gradeBook.getOneGrade(2));

        //Alterando uma nota específica
        System.out.println("Alterando a nota do 5° aluno: ");
        gradeBook.setOneGrade(4, 4.6);

        //Lendo apenas a nota da posição 4
        System.out.println("Lendo apenas a nota do aluno 5");
        System.out.println(gradeBook.getOneGrade(4));

        //Lendo todas as notas novamente
        System.out.println("Lendo todas as notas novamente: ");
        System.out.println(Arrays.toString(gradeBook.getGrades()));

        //Apresentando o Relatório de Notas
        System.out.println("Apresentando o Relatório de Notas: ");
        System.out.println(gradeBook.report());

    }
}
