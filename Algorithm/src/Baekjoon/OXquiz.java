package Baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class OXquiz {
    public static void main(String[] args) {
    Object[] arr = new Object[]{1,2,3,4,5};
    Test test = new Test();
        System.out.println(test.stringify(arr));
    }


}

class Test{
    public String stringify(Object data) {
        String result ="";
        Object head = ((Object[])data)[0];
        result = "\"" + head + "\"";
        stringify(Arrays.copyOfRange(((Object[]) data), 1, ((Object[]) data).length));
        return "[" + result + "]";
    }
}
