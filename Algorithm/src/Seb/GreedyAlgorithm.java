package Seb;

import java.util.*;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        //박스 무게제한보다 무거운 물건은 없음.
        //옮겨야할 짐의 개수는 1개이상 50,000개 이하
        int[] stuff = new int[]{
                42, 25, 60, 73, 103, 167, 60
        };
        int limit = 187;
        int box = 0;
        Arrays.sort(stuff);

        //물건 무게를 정렬해서 중앙값을 root으로하는 이진트리 생성

        //가장 무거운물건과 가장가벼운 물건을 매칭하는데 이때 박스의무게를 초과해선안되고 남는공간도 최소화해야한다.
        /*
        * 1. 리스트를 생성하여 최대값을 구한다.
        *   1-1 작업할 리스트를 만든다. que linkedList
        *   1-2 이미 포장한 리스트를 만든다. packed(boolean) - 디폴트값 false
        *   1-3 아직 포장이 안된(false) 최대값(stuff) que에 넣고  packed 해당인덱스(stuff.length)를 true로 변환
        * 2. 박스용량-최대값 = 남은용량이 최소값stuff[0]보다
        *   2-1 작을경우 최대값 큐에서 삭제하고 1-3부터 다시 시작
        *   2-2 클 경우 가까운 숫자 이진탐색
        *
        *   2-2
        * 3. 찾고나서 만약 박스용량 - (두 수의 합)이 최소값(list[0])보다 작을경우(limit - (max+find) < list[0])  ----용량이 부족한경우
        *   3-1 box+1하고  최대값과(max) 리스트에서 삭제 해당값(find) -디폴트 변경 2번 반복
        * 4.  만약 박스용량 - (두 수의 합)이 최소값(list[0])보다 클 경우(limit - (max+find) > list[0])  --- 용량이 남는 경우
        *   4-1 최대값(max)을 리스트에서 지우고 최대값(max)과 해당값(find)를 새로은 max로 queue에 넣고 2번 반복
        *   3-1
        *   3-1

        * 5. 리스트가 비어있으면 종료 while(!queue.isEmpty())
        * */
        //박스에 담기면 박스 개수 카운트


        //1-1 작업할 리스트를 만든다. que linkedList
        //1-2 이미 포장한 리스트를 만든다. packed(boolean) - 디폴트값 false
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] packed = new boolean[stuff.length];


        //1-3 아직 포장이 안된(false) 최대값(stuff) que에 넣고  packed 해당인덱스(stuff.length)를 true로 변환
        if(!packed[stuff.length-1]){
            queue.add(stuff[stuff.length-1]);
            packed[stuff.length-1] = true;
        }
        //2. 박스용량-최대값 = 남은용량이 최소값stuff[0]보다
        if(limit - queue.peek() < stuff[0])
        //2-1 작을경우 최대값 큐에서 삭제하고 1-3부터 다시 시작
        //2-2 클 경우 가까운 숫자 이진탐색
        System.out.println(queue);
        System.out.println(Arrays.toString(packed));
    }
}
