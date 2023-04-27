/*
Faça um programa que mostra o valor das vendas de uma loja e
a média de vendas de todos os vendedores. O usuário do programa
deve fornecer a quantidade de vendedores da loja e o valor das vendas
de cada vendedor.

Modifique o programa anterior para mostrar o maior valor de vendas e o
número do vendedor que mais vendeu.
*/
import java.util.Scanner;

public class Sales {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de vendedores: ");
        int qtySalers = input.nextInt();

        double sales, totalSales = 0;
        double max_sale = Double.NEGATIVE_INFINITY;
        int max_saler = 1;

        for(int i = 1; i <= qtySalers; i++){
            System.out.printf("Valor das vendas do %d° vendedor: ", i);
            sales = input.nextDouble();
            totalSales += sales;

            if(sales > max_sale){
                max_sale = sales;
                max_saler = i;
            }

        }

        System.out.printf("Valor total das vendas: R$ %.2f%n", totalSales);
        System.out.printf("Média das vendas de todos os vendedores: R$ %.2f%n", totalSales/qtySalers);
        System.out.printf("O vendedor %d teve o maior valor de vendas: R$ %.2f", max_saler, max_sale);
    }
}
