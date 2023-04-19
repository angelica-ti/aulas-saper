public class DateTest {
    public static void main(String[] args){
        Date birthday = new Date(3,3,1997);

        birthday.displayDate();
        System.out.println("Apresentando informações do objeto Date:");
        System.out.printf("Dia: %d%n", birthday.getDay());
        System.out.printf("Mês: %d%n", birthday.getMonth());
        System.out.printf("Ano: %d%n", birthday.getYear());

        System.out.println("Alterando data de aniversário:");
        System.out.println("Alterando o dia...");
        birthday.setDay(27);
        System.out.println("Alterando o mês...");
        birthday.setMonth(12);
        System.out.println("Alterando o ano...");
        birthday.setYear(1994);

        birthday.displayDate();
    }
}
