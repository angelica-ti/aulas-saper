import java.util.Arrays;
import java.util.Collections;

public class RestaurantReview {
    public static void main(String[] args){
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int numberUsers = 100;

        double[] reviews = new double[max];

        int rand = 0;
        for(int i = 0; i < numberUsers; i++){
            rand = (int)(Math.random() * range) + min;
            reviews[rand-1] += 1;
        }

        for(int i = 0; i < reviews.length; i++){
            reviews[i] /= numberUsers;
        }

        System.out.println(Arrays.toString(reviews));

    }

}
