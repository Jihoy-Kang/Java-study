package Collection;

//정적 내부클래스는 외부클래스 생성과 무관하게 정적 변수와 정적메서드를 사용하기 때문에 static이 아닌 일반 변수와 메서드는 사용 못한다.
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer2.StaticInClass bb = new Outer2.StaticInClass();
        bb.Test();
    }
}
class Outer2{
    private int no = 2;
    private static int no2 = 10;

    void method(){
        System.out.println("일반 메서드");
    }
    static void method2(){
        System.out.println("정적 메서드");
    }


    static class StaticInClass{

        void Test(){
            //System.out.println("외부 no " + no); 사용불가 : non-static
            System.out.println("외부(정적) no2 " + no2);
            //method(); 사용불가 : non-static
            method2();
        }
    }

}