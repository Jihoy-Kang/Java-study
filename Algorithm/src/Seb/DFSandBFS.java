package Seb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DFSandBFS {
    public static void main(String[] args) {
        int[][] edges = new int[][]{
            {0, 1},
            {2, 3},
            {3, 4},
            {3, 5},
        };

        //사이즈 확인
        int size = 0;
        for(int i = 0; i < edges.length ; i++){
            for(int j = 0; j < 2 ; j++){
                size = Math.max(size,edges[i][j]);
            }
        }
        //인접행렬 생성
        int[][] matrix2 = new int[size+1][size+1];
        int from =0;
        int to = 0;
        for(int i=0;i<edges.length;i++){
            from = edges[i][0];
            to = edges[i][1];
            matrix2[from][to] = 1;
            matrix2[to][from] = 1;
        }

        // 인접리스트 생성
        Graph2 g = new Graph2(size+1);
        for(int i = 0; i < matrix2.length ; i++){
            for(int j = 0; j < matrix2.length ; j++){
                if(matrix2[i][j] ==1){
                    g.addEdge2(i,j);
                }
            }
        }
        System.out.println(g.search2(0));
    }
}

class Graph2{
    class Node{
        int data;
        boolean marked;
        ArrayList<Node> related;
        Node(int data){
            this.data = data;
            this.marked = false;
            this.related  = new ArrayList<Node>();
        }
    }
    Node[] nodes;
    int size;
    Graph2(int size){
        this.size = size;
        nodes = new Node[size];
        for(int i = 0;i<size;i++){
            nodes[i] = new Node(i);
        }
    }
    void addEdge2(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.related.contains(n2)) {n1.related.add(n2);}
        if(!n2.related.contains(n1)) {n1.related.add(n1);}
    }

    int cnt = 0;
    Queue<Node> que= new LinkedList<Node>();
    String search2(int i){
        Node node = nodes[i];
        cnt++;
        que.add(node);
        while(!que.isEmpty()){

            Node base= que.poll();
            for(Node n : base.related){
                if(n.marked == false){
                    n.marked = true;
                    que.add(n);
                }
            }
        }
        for(Node n : nodes){
            if(n.marked ==false){
                search2(n.data);
            }
        }
        return "cnt : " + cnt;
    }
}
