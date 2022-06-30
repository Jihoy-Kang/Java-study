package DailyCoding;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.println(Math.pow(exponent,base)/94906249);
        long result = 1;

        for(int i = 0; i<exponent;i++){
            result = (result * base)%94906249;
        }
        System.out.println(result);
    }
}
