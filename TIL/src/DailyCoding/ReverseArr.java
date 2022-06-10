package DailyCoding;

import java.util.*;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        ArrayControl r = new ArrayControl();
        System.out.println(Arrays.toString(r.Reverse(arr)));

    }
}

class ArrayControl{

    public int[] Reverse(int[] arr){
        if(arr.length == 0) return arr;
        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        int[] tail = Reverse(Arrays.copyOfRange(arr,0,arr.length-1));
        int[] result = new int[arr.length];
        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);
        return result;
    }


}