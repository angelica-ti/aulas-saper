/*
Faça um programa que mostra o valor das vendas de uma loja e
a média de vendas de todos os vendedores. O usuário do programa
deve fornecer a quantidade de vendedores da loja e o valor das vendas
de cada vendedor.
*/
import java.util.Scanner;

public class Sales {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de vendedores: ");
        int qtySalers = input.nextInt();

        double sales, totalSales = 0;

        for(int i = 1; i <= qtySalers; i++){
            System.out.printf("Valor das vendas do %d° vendedor: ", i);
            sales = input.nextDouble();
            totalSales += sales;
        }

        System.out.printf("Valor total das vendas: R$ %.2f%n", totalSales);
        System.out.printf("Média das vendas de todos os vendedores: R$ %.2f", totalSales/qtySalers);
    }
}
