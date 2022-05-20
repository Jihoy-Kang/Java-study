package JavaEffective;

import java.io.ObjectStreamException;

public class LambdaDemo {
    public static void main(String[] args) {
        /*MyFunction f = new MyFunction() {
            @Override //추상 메서드 오버라이딩
            public int max(int a, int b) { // 접근제어자는 오버라이딩 대상 인터페이스보다 넓게
                return a > b ? a : b;
            }
        };*/ //기본 식

        //람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로한다.
        MyFunction f = (a, b) -> a>b?a:b; //람다식, 익명 객체


        int value = f.max(3,5);
        System.out.println(value);
    }
}
@FunctionalInterface // 메서드가 2개 이상 일때 에러 발생
interface MyFunction { // 함수형 인터페이스는 단 하나의 추상메서드를 갖는다.
    public abstract int max(int a, int b); //인터페이스는 public abstract 생략 가능
}

