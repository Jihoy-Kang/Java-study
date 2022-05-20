package JavaEffective;
import java.util.function.Function;
import java.util.function.Supplier;


public class MethodReferenceDemo {
    public static void main(String[] args) {
        //Function<String,Integer> f =(String s) -> Integer.parseInt(s); //람다식
        Function<String,Integer> f = Integer::parseInt; // 메서드 참조
        System.out.println(f.apply("100")+200);

        //Supplier<MyClass> s = () -> new MyClass(); // 매개변수가 없는 람다식
        Supplier<MyClass> s = MyClass::new; // 매개변수가 없는 생성자 참조
        System.out.println(s.get());

        //Function<Integer, MyClass2> s2 = (i) -> new MyClass2(i); // 매개변수가 있는 람다식
        Function<Integer, MyClass2> s2 = MyClass2 :: new; // 매개변수가 있는 생성자 참조
        MyClass2 mc = s2.apply(100);
        System.out.println(mc.i);

        //Function<Integer, int[]> array = (i) -> new int[i]; // 배열 생성 람다식
        Function<Integer, int[]> array = int[]::new; // 배열 생성 메서드 참조
        int[] arr = array.apply(1000);
        System.out.println(arr.length);
    }
}

class MyClass{}

class MyClass2{
    int i;
    MyClass2(int i){
        this.i = i;
    }
}
