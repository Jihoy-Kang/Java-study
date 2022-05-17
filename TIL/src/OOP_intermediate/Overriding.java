package OOP_intermediate;

public class Overriding {
    public static void main(String[] args) {
        Study studies[] = {new Study(),new Math(),new English()}; //상위 클래스로 인스턴스를 생성하는 배열

        for(Study study : studies){ // 배열을 활용한 매서드 출력
            study.do_it();
        }
    }
}
class Study{
    void do_it(){
        System.out.println("공부를 시작합니다");
    }
}
class Math extends Study{
    void do_it(){
        System.out.println("수학공부를 시작합니다");
    }
}
class English extends Study{
    void do_it(){
        System.out.println("영어공부를 시작합니다");
    }
}