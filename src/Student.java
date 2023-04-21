/*
Crie uma classe Student que inclui dois atributos: nome (String) e
média (double). Forneça um construtor que inicializa o nome e inicializa
a média caso ela seja maior ou igual a 0 e menor ou igual a 100. Forneça
métodos set e get para cada atributo. No caso da média, o método set
também deve fazer uma validação assim como no construtor. Além disso,
construa um método que associa um conceito à média do aluno conforme
a tabela abaixo. Em seguida, crie uma classe de teste.
ConceitoMédia
Amaior ou
ConceitoMédia
Amaior ou igual a 90
Bmaior ou igual a 80 e menor que 90
Cmaior ou igual a 70 e menor que 80
Dmaior ou igual a 60 e menor que 70
Fmenor que 60
**/

public class Student {
    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;
        if(average>=0 && average <= 100){
            this.average = average;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        if(average>=0 && average <= 100){
            this.average = average;
        }
    }

    public double getAverage() {
        return average;
    }

    public char getConcept(){
        char concept = ' ';
        if(average >= 90){
            concept = 'A';
        }
        else if(average >= 80){
            concept = 'B';
        }
        else if (average>=70) {
            concept = 'C';
        }
        else if (average >= 60) {
            concept = 'D';
        }
        else{
            concept = 'E';
        }

        return concept;
    }
}
