package Seb;
import java.util.*;
//프린터가 작업 끝내는 시간을 알아내야한다.
//burfferSize는 프린터가 처리하는 작업공간
//capacities는 프린터가 처리할수 있는 최대 용량
//documents[]는 작업 대기중인 문서들, 숫자는 용량

//1초에 작업공간 한칸씩 이동 ex)  작업공간이 3개인 프린터에서 첫번째문서가 프린트 되는시간 4초
//2개의 문서가 동시에 작업공간으로 진입 불가
// 프린터의 용량을 초과하여 문서진입불가
// 작업공간보다 많은 문서프린트작업 불가

public class PrinterQue {
    public static void main(String[] args){
        //문제 조건
        int bufferSize = 1;
        int capacities = 100;
        int[] documents = new int[]{1, 24, 14, 78, 90};

        //필요 변수 선언
        int sec = 1;
        int i = 1;

        //큐, 배열 선언
        ArrayList<Integer> pollQue = new ArrayList<Integer>(); // 작업완료시간을 담을 배열
        Queue<Integer> queue = new LinkedList<Integer>(); // 작업중인 문서 que

        queue.offer(documents[0]); // 최초 큐가 비어있으면 while진입이 안되니 초기값 설정
        pollQue.add(bufferSize+1); // 최초 문서의 작업완료시간
        int queCapa = documents[0]; // 큐가 작업중인 용량을 담을 변수 선언과 초기값 설정
        while (!queue.isEmpty()){ // 큐가 빌때까지 반복
            sec += 1; //반복하는 할때 1초씩 상승
            if(sec == pollQue.get(0)){ //sec이 작업완료 시간과 같을 경우
                queCapa = queCapa - queue.peek(); // queue삭제전 용량부터 줄여주고,
                queue.poll(); // 작업완료한 문서를 queue에서 삭제
                pollQue.remove(0); // 작업완료시간도 삭제
            }
            if(i < documents.length){ // 프린트 할 문서가 남아있을때만 다음 if문 진입
                if(queue.size() < bufferSize && (queCapa+documents[i]) <= capacities){ // 큐에 작업공간이 충분해야하고, 작업 용량이 남아있을 때
                    queue.offer(documents[i]); // 문서를 추가하고
                    queCapa = queCapa + documents[i]; // 추가한 문서의 용량을 더해준다.
                    pollQue.add(sec+bufferSize); // 작업완료시간을 배열에 담아주자
                    i += 1; // 다음 문서를 담기 위해 문서 인덱스 번호 1증가
                }
            }
        }
        System.out.println(sec);
    }
}
