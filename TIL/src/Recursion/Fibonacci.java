package Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        //문제 정의 : 입력받은 개수(input)만큼 피보나치 수열을 출력하라.
        //종료 조건 : 입력받은 개수만큼 수열을 출력으하면 종료
        Fibo f = new Fibo();
        int input = 5;

        for(int i=1; i<=input ; i++){
            System.out.println(f.fibo(i));
        }


    }
}
class Fibo{
    //종료 조건:
    public static int fibo(int n){
        if(n<=1){
            return n;
        }else {
            return fibo(n-2)+fibo(n-1);
        }
    }
}
/*

/for 문을 사용할 때 복잡도  O(n)

재귀 사용할 때 복잡도 O(2^n)
재귀를 쓸 수 있다고해서 막 쓰는 것은 옳지않다.
표기적이나 알고리즘적으로 볼 때 재귀가 알아먹기 편할 때 사용하는 것
-> 유지보수성 때문에 // 단순히 효율이나 성능만 볼게 아니고 협업하는과정에서 다른사람들이 내 코드를 쉽게 이해하고 수정할 수 있어야한다.

*/
