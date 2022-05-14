package OOP2;
import  EncapsulationTest.ImportTest; //import로 다른 패키지의 클래스를 불러올 수 있다.


public class Encapsulation extends EncapsulationTest.ImportTest {
    public void printEach() {
        // System.out.println(a); // private으로 다른패키지 호출 불가
        // System.out.println(b); // default 다른패키지 하위클래스 호출 불가
        System.out.println(c); // protected 다른 패키지의 하위 클래스
        System.out.println(d); // public
    }
}

class Test2 {
    public static void main(String[] args) {
        ImportTest test = new ImportTest();

//        System.out.println(test.a); // public을 제외한 모든 호출 에러!
//        System.out.println(test.b);
//        System.out.println(test.c); // extends가 없기 때문에 이 클래스는 ImportTest의 하위 클래스 아님
        System.out.println(test.d);
    }
}