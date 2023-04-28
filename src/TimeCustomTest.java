public class TimeCustomTest {
    public static void main(String[] args){
        TimeCustom t1 = new TimeCustom();
        TimeCustom t2 = new TimeCustom(2);
        TimeCustom t3 = new TimeCustom(21,34);
        TimeCustom t4 = new TimeCustom(12, 25, 42);
        TimeCustom t5 = new TimeCustom(t4);

        System.out.println(t1.displayTime());
        System.out.println(t2.displayTime());
        System.out.println(t3.displayTime());
        System.out.println(t4.displayTime());
        System.out.println(t5.displayTime());
    }
}
