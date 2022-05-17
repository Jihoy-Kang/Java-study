package OOP_intermediate;

public class Polymorphism {
    //인스턴스 생성
    Water water = new Water();
    Coke coke = new Coke();
    Water coke2 = new Coke();
    //Coke water2 = new Water(); -> 상위 클래스 참조 불가로 에러발생
    //형변환
    Water coke3 = (Water)coke; //상위 클래스로 형변환이기 때문에 (Water)생략가능
    Coke water2 = (Coke)water; //하위 클래스로 형변한이기 때문에 (Coke)생략 불가능
    //SparklingWater coke4 = (SparklingWater)coke -> 상속관계가 아니기때문에 에러발생

}

class Water{
    String brand;
    String type;
    int price;

    void drink(){
        System.out.println("시원해");
    }
    void drink2(){
        System.out.println("갈증해소");
    }
}

class Coke extends Water{
    void drink3() {
        System.out.println("스트레스해소");
    }
}
class SparklingWater extends Water{
    void drink4(){
        System.out.println("청량감증가");
    }
}
