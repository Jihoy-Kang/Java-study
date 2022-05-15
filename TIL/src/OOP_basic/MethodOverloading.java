package OOP_basic;

public class MethodOverloading {
    public static void main(String[] args) {
        소개 intro = new 소개();
        intro.소개();
        intro.소개("조르바");
        intro.소개(30);
        intro.소개(172.2);
    }
}

class 소개{
    public void 소개(){
        System.out.println("자기소개");
    }

    public void 소개(String name){
        System.out.println("제 이름은 " + name + "입니다.");
    }

    public void 소개(int age){
        System.out.println("나이는 " + age + "살 입니다.");
    }

    public void 소개(Double height){
        System.out.println("키는 " + height + "입니다.");
    }
}