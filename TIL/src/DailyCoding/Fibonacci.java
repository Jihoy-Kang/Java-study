package DailyCoding;

public class Fibonacci {
    public static void main(String[] args) {
        int num =5;
        //n = n-2 + n-1
        Fibo f = new Fibo();
        f.fibo(num);
    }
}

class Fibo{
    public static int fibo(int n){
        if(n <= 1){
            return n;
        }else{
            return fibo(n-2)+fibo(n-1);
        }
    }
}
