package OOP_basic;

public class Constructor {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("오토바이","레드");
        Vehicle car2 = new Vehicle("승용차","black");
        Vehicle car3 = new Vehicle("버스","white");
        car1.시동();
        car2.시동();
        car3.시동();
    }
}

class Vehicle{
    public String type;
    public String color;
    public Vehicle(String type, String color){
        this.type = type;
        this.color = color;
    }
    public void 시동(){
        System.out.println(type + ": 시동 on");
    }
    public void 정지(){
        System.out.println("서라");
    }
}
