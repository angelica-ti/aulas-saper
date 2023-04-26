import java.util.Scanner;

public class AveragePositivePairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, qtyPositivePairs = 0, sumPositivePairs = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            number = input.nextInt();
            if (number > 0 && number % 2 == 0) {
                sumPositivePairs += number;
                qtyPositivePairs++;
            }
        } while (number != -1);

        if (sumPositivePairs > 0) {
            double average = sumPositivePairs / qtyPositivePairs;
            System.out.printf("Média dos positivos pares digitados: %.2f", average);
        } else {
            System.out.println("Nenhum inteiro positivo par!");
        }
    }
}