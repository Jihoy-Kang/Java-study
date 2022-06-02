package Seb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class convertListToObject {
    public static void main(String[] args) {
       String[][] arr = new String[][]{
            {"make", "Ford"},
            {"model", "Mustang"},
            {"year", "1964"},
            {"make", "Bill"},
       };

        HashMap<String,String> map = new HashMap<String,String>();
        for(String[] a :arr){
            if(map.containsKey(a[0])){
                continue;

            }
            map.put(a[0],a[1]);
        }
        System.out.println(map);
    }
}
