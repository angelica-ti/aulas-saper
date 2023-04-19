import java.util.Scanner;

/*João consegue terminar uma corrida com percurso de 1260 metros em 4 min. Faça um programa para mostrar a velocidade
média de Joãoem metros por segund*/
public class Main {
    public static void main(String[] args) {
        float distance = 1260, timeMinutes = 4, timeSeconds, velocity;
        timeSeconds = timeMinutes*60;
        velocity = distance/timeSeconds;
        System.out.printf("Velocidade média do João %.2f m/s%n", velocity);
        System.out.printf("Velocidade média do João %.2f m/s%n", 1260.0/(4*60));
        System.out.printf("Velocidade média do João %.2f km/h", (1260.0/1000)/(4.0/60));
    }
}