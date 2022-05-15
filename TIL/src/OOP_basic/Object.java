package OOP_basic;

public class Object {
    public static void main(String[] args) {
        Car hyundai = new Car("코나","블랙",4); //객체 생성
        System.out.println("모델은 "+hyundai.model+"이고 색상은 " + hyundai.color+ "이며 타이어는 " + hyundai.wheel +"개 있다.");
        hyundai.on(); // 메서드 호출
        hyundai.stop();
        hyundai.accelerate();
    }
}

class Car{
    public String model; // 필드 선언
    public String color;
    public int wheel;

    public Car(String model, String color, int wheel){ //인스턴스 초기화를 위한 생성자 함수
        this.model = model;
        this.color = color;
        this.wheel = wheel;
    }

    //메서드 선언
    void on(){
        System.out.println("시동 on");
    }

    void stop(){
        System.out.println("멈춰");
    }

    void accelerate(){
        System.out.println("달ㄹ달려");
    }
}