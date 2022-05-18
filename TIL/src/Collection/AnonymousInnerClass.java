package Collection;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Korea korea = new Korea(); // 익명클래스 사용안할 시
        korea.say();

        HelloWorld China = new HelloWorld(){ //익명클래스 사용 시
            public void say(){
                System.out.println("Nihao,Shijian");
            }
        };
        China.say();
    }
}
interface HelloWorld{
    public void say();
};

class Korea implements HelloWorld{
    public void say(){
        System.out.println("안녕,세상아");
    }
}


