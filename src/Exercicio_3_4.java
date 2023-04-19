import java.util.Scanner;

public class Exercicio_3_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um inteiro: ");
        int n1 = input.nextInt();

        if(!(n1<0)){
            System.out.println("Inteiro não-negativo");
        }

        if(n1 > 2 && n1 <= 9){
            System.out.println("Inteiro no intervalo (2,9]");
        }

        if(n1 > 10 || n1 < 0){
            System.out.println("Inteiro negativo ou maior que 10");
        }
    }
}
