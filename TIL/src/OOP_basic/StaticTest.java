package OOP_basic;

public class StaticTest {
    public static void main(String[] args) {
        StaticEx 테스트1 = new StaticEx();
        StaticEx 테스트2 = new StaticEx();

        테스트1.num = 1;
        테스트2.num = 2;
        System.out.println(테스트1.num);
        System.out.println(테스트2.num);

        테스트1.sNum = 1111;
        테스트2.sNum = 9999;
        System.out.println(테스트1.sNum);
        System.out.println(테스트2.sNum);


    }
}

class StaticEx{
    int num = 100;
    static int sNum = 200;
    
    void 인스턴스메서드(){
        System.out.println(num);
        System.out.println(num);
    }
    
    static void  클래스메서드(){
        //System.out.println(num);
        System.out.println(sNum);
    }
    
}
