package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{10,99,123,7};
        int[] sample = new int[]{11,100,99,123};

        //sample이 base의 부분 집합인지 여부를 리턴


        ArrayList<Integer> baseList = new ArrayList<>();
        for(int b : base){
            baseList.add(b);
        }
        //ArrayList<Integer> sampleList = new ArrayList<>();
        for(int s : sample){
            if(!baseList.contains(s)){
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
class isSubset{

}
