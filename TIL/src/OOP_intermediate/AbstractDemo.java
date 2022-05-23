package OOP_intermediate;

public class AbstractDemo {
    public static void main(String[] args) {
        AbstractTest2 abst = new AbstractTest2();
        abst.test();
    }
}

abstract class AbstractTest{ // 추상메서드를 포함하고있는 추상클래스
    abstract void test(); //시그니처만 있고 바디가 없는 추상메서드
}

class AbstractTest2 extends AbstractTest{
    void test(){
        System.out.println("추상클래스 메서드");
    }
}