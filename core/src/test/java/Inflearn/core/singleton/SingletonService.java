package Inflearn.core.singleton;

public class SingletonService {

    //1. static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    //2. 객체 인스턴스가 필요하면 오직 getInstance메서드를 통해서만 호출 할 수 있다.
    public static SingletonService getInstance(){
        return  instance;
    }
    //3. 생성자를 private으로 선언해서 외부에서 new키워드로 객체를 생성하지 못하도록 막는다.
    private SingletonService(){

    }

    public  void login(){
        System.out.println("싱글톤 객체로 호출");
    }

}
