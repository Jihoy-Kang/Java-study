package OOP_intermediate;

public class InterfaceDemo {
    public static void main(String[] args) {
        Airplane  air = new Airplane();
        air.power();
        air.course();

    }
}

interface Transport{ void course();}
abstract class Power{ public abstract void power(); };

class Airplane extends Power implements Transport{

    public void power(){
        System.out.println("제트엔진");
    }
    public void course(){
        System.out.println("하늘");
    }
}

class Ship implements Transport{
    public void course(){
        System.out.println("바다");
    }
}