public class ArrayIntroduction {
    public static void main(String[] args){
        int[] myArray = new int[12];
        String[] Strings = new String[10];

        myArray[0] = 5;
        myArray[1] = 9;
        myArray[2] = 4;

        System.out.printf("%d%n", myArray[0]);
        System.out.printf("%d%n", Strings[0]);
        System.out.printf("%d%n", myArray[11]);
        System.out.printf("%d%n", Strings[10]);
    }
}
