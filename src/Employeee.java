/*
Crie uma classe Employee que inclui três atributos: um
primeiro nome (String), um último nome (String) e um
salário mensal (double). Forneça um construtor que inicializa
os três atributos. Forneça métodos set e get para cada atributo.
Se o salário mensal não for positivo, não inicialize o seu valor.
Escreva um programa EmployeeTest que demonstra as
capacidades da classe Employee. Crie dois objetos Employee e
mostre o salário anual de cada objeto. Depois dê a cada
empregado um aumento de 10% e mo
*/
public class Employeee {

    private String name;
    private String lastName;
    private double salary;
    public Employeee(String name, String lastName, double salary){
        if(salary>0){
            this.salary = salary;
        }
        this.name = name;
        this.lastName = lastName;

    }

    public void setName(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setLast_name(String newLastName) {
        lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double newSalary) {
        if(newSalary>0) {
            salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary(){
        return getSalary() * 12;
    }

    public void increaseSalary(double perc_increase){
        perc_increase /= 100;
        salary *= (1+perc_increase);
    }
}
