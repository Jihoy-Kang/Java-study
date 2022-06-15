package DailyCoding;

public class Modulo {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 0;
        int result = num1;
        if(num1 == 0) {System.out.println(0);}
        if(num2 == 0) {System.out.println("null");}
        while(result > num2){
            result = result - num2;
        }
        System.out.println(result);
    }
}
