package Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        ColTest<String> test = new ColTest<>();
        test.set("테스트");
        String Val = test.get();
        System.out.println(Val);
    }
}
class ColTest<T> {
    private T name;
    public T get() { return name;}
    public void set(T name){ this.name = name; }
}
