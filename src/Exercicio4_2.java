import java.util.Scanner;

public class Exercicio4_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number1 = input.nextInt();
        int mod;

        if(number1<0){
            mod = -1*number1;
        }
        else{
            mod = number1;
        }
        System.out.printf("%nMódulo de %d é %d", number1, mod);
    }
}
