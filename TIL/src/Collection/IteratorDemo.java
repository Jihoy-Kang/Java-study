package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        Iterator<Integer> iterator = array.iterator();

        while (iterator.hasNext()){
            int value = iterator.next();
            System.out.println(value);
        }
    }
}
