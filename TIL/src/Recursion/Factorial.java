package Recursion;

public class Factorial {
    static int factorial = 1;
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        factorial *= n;
        if(n == 1){
            return factorial;
        }else{
            System.out.println(n);
            System.out.println(factorial);
            return factorial(n-1);
        }
    }
}
