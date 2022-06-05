package Recursion;

public class Sample1 {
    static int sum;  //인스턴스 없이 바로 구현할 것이기 때문에 static을 활용해 변수 선언
    public static void main(String[] args) {
        System.out.println(sum(10));

    }
    public static int sum(int a){
        sum += a;
        if(a == 0){ // 종료
            return  sum;
        }else{
            return sum(--a); // 재귀호출
        }
    }
}
