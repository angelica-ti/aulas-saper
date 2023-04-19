/*
Construa uma classe chamada Date que inclui três atributos:
mes (int), dia (int) e ano (int). Forneça um construtor que
inicializa os três atributos e assume que os valores fornecidos
são corretos. Forneça métodos set e get para cada atributo.
Forneça um método displayDate que mostra o dia, mês e ano
separados por barra (/). Escreva um programa principal para
demonstrar as características da classe Date
*/

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int newMonth){
        month = newMonth;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int newDay){
        day = newDay;
    }

    public int getDay(){
        return day;
    }

    public void setYear(int newYear){
        year = newYear;
    }
    public int getYear(){
        return year;
    }

    public void displayDate(){
        System.out.printf("%02d/%02d/%04d%n",day,month,year);;
    }
}
