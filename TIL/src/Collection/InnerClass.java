package Collection;

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.InClassTest();
    }

}

class OuterClass{
    private int no = 2;
    private static int no2 = 10;
    InClass inClass = new InClass();

    public OuterClass(){
        inClass = new InClass();
    }

    class InClass{
        int innerNum = 100;

        void Test(){
            System.out.println("외부 no " + no);
            System.out.println("외부(정적) no2 " + no2);
        }
    }

    public void InClassTest(){
        inClass.Test();
    }
}