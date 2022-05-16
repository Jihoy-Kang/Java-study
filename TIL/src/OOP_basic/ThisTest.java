package OOP_basic;

public class ThisTest {
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test(2);
    }
}

class Test{
    public Test(){
        System.out.println("기본 생성자 호출");
    }
    public Test(int num){
        this(); //기본 생성자 호출 메서드
        System.out.println("두번째 생성자 호출");
    }
}