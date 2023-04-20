/*
Faça um programa que calcula o que deve ser
pago por um produto, considerando o preço
original e a forma de pagamento:
CódigoPagamento
1Dinheiro: 10% de desconto
21x no cartão: 5% de desconto
32x no cartão: preço original
43x no cartão: juros de 5% do original
*/

import java.util.Scanner;
public class Payment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double price = input.nextDouble();
        System.out.println("Escolha a forma de pagamento:\n" +
                            "(1) - Dinheiro\n"+
                            "(2) - 1x no cartão\n"+
                            "(3) - 2x no cartão\n"+
                            "(4) - 3x no cartão");
        int paymentForm = input.nextInt();

        double finalPrice = price;
        switch (paymentForm){
            case 1:
                finalPrice *= 0.9;
                System.out.println("10% de desconto");
                break;
            case 2:
                finalPrice *= 0.95;
                System.out.println("5% de desconto");
                break;
            case 3:
                System.out.println("Preço Original");
                break;
            case 4:
                finalPrice *= 1.05;
                System.out.println("Juros de 5% do original");
                break;
            default:
                System.out.println("Opção Inválida!");
        }

        System.out.printf("Preço final do produto: %.2f", finalPrice);
    }
}
