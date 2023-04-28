import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsIntro {
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();
        items.add("red");
        items.add(0, "yellow");
        items.add("green");
        items.add("yellow");
        display(items, "\nDisplay List contents with enhanced for statemant");
//        display(items, "\nList with two new elements");
//        items.remove("yellow");
//        display(items, "List");
//        items.remove(1);
        removeAll(items,"yellow");
        display(items, "List");

        System.out.printf("%b%n", items.contains("red"));
        System.out.printf("%d%n", items.size());
    }

    private static void display(ArrayList<String> items, String header){
        System.out.println(header);
        System.out.println(Arrays.toString(items.toArray()));
//        for(String item:items){
//            System.out.printf("%s ",item);
//        }
    }

    private static void removeAll(ArrayList<String> items, String value){
        while(items.contains(value)){
            items.remove(value);
        }
    }
}
