public class ArraysParameters {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        multiplyArrayBy2(array);
        System.out.printf("The values of the modified array are:%n");
        display(array);

        multiplyArrayBy2(array);
        System.out.printf("%n");
        System.out.printf("The values of the modified array are:%n");
        display(array);

        String[] array2 = {"Saper", "Java"};
        display(array2);

    }
    private static void multiplyArrayBy2(int[] oldArray){
        for(int counter = 0; counter < oldArray.length ; counter++){
            oldArray[counter] *= 2;
        }
    }
    private static void display(int[] array){
        for(int element: array){
            System.out.printf("%d ", element);
        }
        System.out.println();

    }
    private static void display(String[] array){
        for(String element: array){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}

