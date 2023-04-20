/*
Faça um programa que recebe os coeficientes
de uma equação do segundo grau e mostra as
suas raízes. O programa deve avisar caso não
tenha raízes reais.
*/
import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = input.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = input.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = input.nextDouble();

        String sign2 = b<0? "":"+";
        String sign3 = c<0? "":"+";

        System.out.printf("Soluções para a equação: %.2fx² %s %.2fx %s %.2f = 0%n", a, sign2, b, sign3, c);

        double delta = Math.pow(b,2) -4 *a*c;

        if(delta==0){
            double x = (-1*b)/(2*a);
            System.out.printf("Δ  = 0 -> Equação apresenta apenas um valor real: %.2f!", x);
        }
        else if(delta>0){
            double x1 = (-1*b + Math.sqrt(delta))/(2*a);
            double x2 = (-1*b - Math.sqrt(delta))/(2*a);
            System.out.printf("Δ  > 0 -> A equação apresenta 2 raízes reais: %.2f e %.2f", x1, x2);
        }
        else{
            System.out.println("Δ < 0 -> Equação não possui valores reais!");
        }

    }
}
