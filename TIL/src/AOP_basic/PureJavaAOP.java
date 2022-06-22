package AOP_basic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PureJavaAOP {
    public static void main(String[] args) {
        Logic core = new CoreLogic(90, 80, 70);

        Logic proxy = (Logic) Proxy.newProxyInstance( //크로스커팅로직 프록시 생성
                CoreLogic.class.getClassLoader(), // core 로직정보
                new Class[]{Logic.class}, //적용 인터페이스 클래스 배열에 해당 클래스 삽입
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        long start = System.currentTimeMillis(); // 크로스커팅로직

                        Object result = method.invoke(core,args);

                        long end = System.currentTimeMillis(); // 크로스커팅로직
                        String message = (end - start) + "ms 초과";
                        System.out.println("message = " + message);

                        return result;
                    }
                }
                
        );
        System.out.println("((CoreLogic) core).total() = " + proxy.total());
        System.out.println("proxy.avg() = " + proxy.avg());
    }
}
