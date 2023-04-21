import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Testando entrada de média negativa:");
        Student aluno0 = new Student("Angélica",-2);
        System.out.printf("Média %.2f%n", aluno0.getAverage());

        System.out.println("Testando setar média negativa:");
        aluno0.setAverage(-1);
        System.out.printf("Média %.2f%n", aluno0.getAverage());


        System.out.print("Digite o nome do aluno: ");
        String name = input.nextLine();
        System.out.print("Digite a nota 1 do aluno: ");
        double n1 = input.nextDouble();
        System.out.print("Digite a nota 2 do aluno: ");
        double n2 = input.nextDouble();

        double average = (n1+n2)/2;

        Student aluno = new Student(name,average);
        System.out.printf("Aluno(a) %s obteve conceito: %c%n", aluno.getName(), aluno.getConcept());


    }
}
