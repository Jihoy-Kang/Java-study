package OOP_intermediate;

public class SuperTest {
    public static void main(String[] args) {
        Police p = new Police();
        p.callName();
    }
}
class  Person{
    String name = "나사람";
    int num = 555;
    Person(){
        System.out.println("사람입니다.");
    }


}
class Police extends Person{
    String name = "나경찰";
    Police(){
        super();
        System.out.println("경찰입니다.");

    }
    void callName(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}