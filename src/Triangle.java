import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do 1° lado: ");
        double side1 = input.nextDouble();
        System.out.println("Digite o tamanho do 1° lado: ");
        double side2 = input.nextDouble();
        System.out.println("Digite o tamanho do 1° lado: ");
        double side3 = input.nextDouble();

        if(side1 < (side2+side3) && side2 < (side1+side3) && side3 < (side1+side2)){
            if(side1 == side2 && side2 == side3){
                System.out.println("Triângulo Equilátero!");
            }
            else{
                if(side1 == side2 || side1==side3 || side2 == side3){
                    System.out.println("Triângulo Isósceles!");
                }
                else{
                    System.out.println("Triângulo Escaleno!");
                }
            }
        }
        else{
            System.out.println("Não é possível formar um triângulo!");
        }
    }
}
