public class TypeReference {
    public static void main(String[] args){
        int number = 1;
        int number2 = number;
        number = 2;

        System.out.printf("Primeiro número %d%n", number);
        System.out.printf("Segundo número %d%n", number2);

        Account myAccount = new Account("Angélica", 5786.0);
        myAccount.setName("Java");
        Account myAccount2 = myAccount;
        myAccount.setName("Thiago");

        System.out.printf("Nome: %s%n", myAccount.getName());
        System.out.printf("Nome: %s", myAccount2.getName());

    }
}
