/*
Vamos desenvolver uma classe GradeBook que professores
podem usar para armazenar as notas de uma prova dos alunos e mostrar um relatório que contém as notas, média das notas, menor nota, maior nota, e uma distribuição de notas. A classe
GradeBook deve ter como atributos o nome do curso e as notas
dos alunos do curso. A distribuição de notas deve levar em
consideração a frequência de notas em cada intervalo a seguir:
[0.0, 1.0), [1.0, 2.0), [2.0, 3.0), [3.0, 4.0), [4.0, 5.0),
[5.0, 6.0), [6.0, 7.0), [7.0, 8.0), [8.0, 9.0), [9.0, 10.0]
*/
import java.util.Arrays;

public class GradeBook {

    private String courseName;
    private double[] grades;
    public GradeBook(String courseName, double[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public void setOneGrade(int i, double grade) {
        this.grades[i] = grade;
    }

    public double getOneGrade(int i) {
        return this.grades[i];
    }

    public double[] getGrades() {
        return grades;
    }

    public double[] lowestHighestGrade(){
        double[] lowestHighestGrade = new double[2];
        lowestHighestGrade[0] = Double.POSITIVE_INFINITY;
        lowestHighestGrade[1] = Double.NEGATIVE_INFINITY;

        for(double grade: grades){
            if(grade<lowestHighestGrade[0]){
                lowestHighestGrade[0] = grade;
            }
            if(grade>lowestHighestGrade[1]){
                lowestHighestGrade[1] = grade;
            }
        }

        return lowestHighestGrade;
    }

    public double average(){
        double average = 0;

        for(double grade: grades){
            average += grade;
        }

        return average/grades.length;
    }

    public double[] gradeDistribution(){
        double[] distribution = new double[10];
        int i;
        for(double grade: grades){
              if(grade == 10){
                  i = 9;
              }
              else {
                  i = (int) grade;
              }
              distribution[i] ++;
        }

        for(int j = 0; j < distribution.length; j++){
            distribution[j] /= distribution.length;
        }
        return distribution;
    }
    public String report(){
        double[] grades = getGrades();
        double[] lowestHighestGrade = lowestHighestGrade();
        double lowerGrade = lowestHighestGrade[0];
        double highestGrade = lowestHighestGrade[1];
        double average = average();
        double[] distribution = gradeDistribution();

        String report = "\n|| ----- Relatório das Notas dos Alunos ----- ||\n"+
                        "-------------------------------------------------"+
                        "\nNotas dos alunos: "+ Arrays.toString(grades)+
                        "\nMenor Nota: "+ lowerGrade +
                        "\nMaior Nota: "+ highestGrade +
                        "\nMédia das Notas: "+average +
                        "\nDistribuição das Notas: "+ Arrays.toString(distribution);

        return report;
    }
}
