/*Cire um programa que usa um comando for para comar os inteiros
pares de 2 até 20 e armazena o resultado em uma variável chamada total
*/
public class Pairs2To20 {
    public static void main(String[] args){
        int sumPairs = 0;
        System.out.println("Inteiros Pares de 2 à 20:");
        for(int i = 2; i <= 20; i += 2) {
            sumPairs += i;
            System.out.printf("%d ",i);
        }
        System.out.printf("\nSomatório dos inteiros pares de 2 à 20: %d", sumPairs);
        //System.out.println("Inteiros Pares de 2 à 20:");
        //for(int i = 2; i <= 20; i++) {
        //    if(i % 2 == 0){
        //      sumPairs += i;
        //      System.out.printf("%d ",i);
        //    }
        //}
    }
}
