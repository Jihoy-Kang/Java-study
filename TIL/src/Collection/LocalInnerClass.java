package Collection;

public class LocalInnerClass {
    public static void main(String[] args) {
        LocalOuter outer = new LocalOuter();
        outer.test();
    }
}

class LocalOuter{
    String name = "코딩";

    void test(){ // 외부클래스 매서드
        int age = 17;
        class LocalInnerClass{ //로컬 내부 클래스
            void print(){
                System.out.println("이름 : " + name);
                System.out.println("나이 : " + age);
            }
        }
        LocalInnerClass localClass = new LocalInnerClass(); // 객체 생성
        localClass.print();
    }
}