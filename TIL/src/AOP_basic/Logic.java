package AOP_basic;

public interface Logic {

    public default int total() {
        return 0;
    }

    public default float avg(){
        return 0;
    }

}
