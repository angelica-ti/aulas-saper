import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args){

        System.out.println("Digite um inteiro: ");
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        do{
            System.out.printf("%d", counter);
            counter += 1;

        }while (counter <= 10);

        System.out.print("\nDepois do do..while\n");
        System.out.print(counter);
    }
}
