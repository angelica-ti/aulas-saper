import java.util.Scanner;

public class Wines {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char typeWine;
        double percR = 0, percB = 0, percT = 0;
        int totalwines = 0;

        while(true){
            System.out.println("Escolha o tipo do vinho:\n"+
                                "(R) - Rosê\n"+
                                "(B) - Branco\n"+
                                "(T) - Tinto\n"+
                                "(S) - Sair"
            );
            System.out.print("Opção: ");

            typeWine = input.nextLine().charAt(0);
            switch (typeWine){
                case 'R':
                    percR += 1;
                    totalwines ++;
                    break;
                case 'B':
                    percB += 1;
                    totalwines ++;
                    break;
                case 'T':
                    percT += 1;
                    totalwines ++;
                    break;
                case 'S':
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

            if(typeWine == 'S' || typeWine == 's'){
                break;
            }
        }
        percR = (percR / totalwines)*100;
        percB = (percB / totalwines)*100;
        percT = (percT / totalwines)*100;

        System.out.printf("Percentural de vinhos\nRosê: %.2f %%\nBranco: %.2f %%\nTinto: %.2f %%", percR, percB, percT);
    }
}
