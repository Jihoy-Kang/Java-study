package Collection;

public class GenericMethod {
    public static void main(String[] args) {
        Gm gm = new Gm();

        String result =  gm.<String>GmTest("Test");
        gm.<String, Integer>getGm("Test",123);
    }
}

class Gm{
    public <T> T GmTest(T t){
        return t;
    }
    public <K, V> void getGm(K k, V v){
        System.out.println(k+ " : "+v);
    }
}
