/*
Faça um programa em que o usuário insere a quantidade de elementos de uma
lista e o programa coloca o valor 0 nas posições pares e 1 nas posições ímpares.
*/

import java.util.Arrays;
import java.util.Scanner;

public class ListExercise {
    public static void main(String[] args){

        System.out.println("Digite o número de elementos do vetor: ");
        Scanner input = new Scanner(System.in);

        int numberElements = input.nextInt();
        int[] vector = new int[numberElements];

        for(int i = 0; i < vector.length; i++){
            if(i % 2 == 0){
                vector[i] = 0;
            }
            else{
                vector[i] = 1;
            }
        }

//        for(int i = 0; i < vector.length; i++){
//            System.out.print(vector[i]+" ");
//        }

        System.out.println(Arrays.toString(vector));
    }
}
