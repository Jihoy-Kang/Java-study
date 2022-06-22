package AOP_basic;

public class CoreLogic implements Logic{
    int kor;
    int math;
    int eng;

    CoreLogic(int kor, int math, int eng){
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int total(){
        //long start = System.currentTimeMillis();
        int result = kor + math + eng;

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //long end = System.currentTimeMillis();

        //String message = (end - start) + "ms 초과";
        //System.out.println("message = " + message);
        return result;
    }

    public float avg(){

        float result = total() / 3.0f;

        return result;
    }
}
