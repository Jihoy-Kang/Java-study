package EncapsulationTest;


class Test { // Test 클래스의 접근 제어자는 default
    public static void main(String[] args) {
        ImportTest test = new ImportTest();

//        System.out.println(p.a); // 동일 클래스가 아니기 때문에 에러발생!
        System.out.println(test.b);
        System.out.println(test.c);
        System.out.println(test.d);
    }
}

public class ImportTest {
    private int a = 1; // 각각 private, default, protected, public 접근제어자 지정
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public void printEach() { // 동일 클래스이기 때문에 에러발생하지 않음
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
