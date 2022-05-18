package Collection;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Carrot");
        fruits.add("Apple");

        Iterator<String> fruit = fruits.iterator();
        while (fruit.hasNext()){
            String result = fruit.next();
            System.out.println(result);
        }
    }
}
