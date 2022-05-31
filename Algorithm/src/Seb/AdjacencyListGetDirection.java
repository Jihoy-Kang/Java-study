package Seb;

import java.util.*;

public class AdjacencyListGetDirection {
    static ArrayList<Integer> prevFroms = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {1, 1, 1, 1, 0},
        };

        int from = 1;
        int to = 4;

/*
        prevFroms.add(from);
        //check from -> to
        if(matrix[from][to] == 1) {
            System.out.println(true);

        } else { //when no direct path

            for(int i = 0; i < matrix[from].length; i++) {

                if(matrix[from][i] == 0) {continue;}

                if(prevFroms.size() == 1) {
                    if(getDirections(matrix, i, to)) {
                        return true;
                    };
                } else {

                    boolean visited = false;
                    for(int num : prevFroms) {
                        if(num == i) {
                            visited = true;
                            break;
                        }
                    }
                    if(visited == false) {
                        if(getDirections(matrix, i, to)) {
                            return true;
                        };
                    }
                    return false;
                }
            }
        }
        return false;
    }*/
        Graph g = new Graph(matrix.length);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==1) {
                    g.addEdge(i, j);
                    System.out.println(i+"|"+j);
                }
            }
        }


        System.out.println(g.search(from,to));



/*        Queue<Integer> que = new LinkedList<Integer>();
        for(int i=0; i < matrix.length ; i++){
            que.add(i); // 노드가 아니면 이미 체크 유무 확인 불가능.
        }
        que.add(from);
        while(!que.isEmpty()){
            if(que.poll() == to){
                System.out.println("true");
            }
            for(int i=0; i < matrix.length ; i++){

            }

        }
        System.out.println("false");*/
    }
}
class Graph{
    class Node{
        int data;
        boolean marked;
        LinkedList<Node> adjacent;
        Node (int data){
            this.data = data;
            this.marked = false;
            this.adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;

    Graph(int size){
        nodes= new Node[size];
        for(int i = 0; i<size ; i++){
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)){n1.adjacent.add(n2);}
        if(!n2.adjacent.contains(n1)){n2.adjacent.add(n1);}
    }

    void initMark(){
        for(Node n: nodes ){
            n.marked = false;
        }
    }
    boolean search(int i1, int i2){
        return search((nodes[i1]), nodes[i2]);
    }
    boolean search(Node from, Node to){
        initMark();
        LinkedList<Node> que = new LinkedList<Node>();
        que.add(from);
        System.out.println(from.adjacent.size());
        while (!que.isEmpty()){
            Node root = que.removeFirst();
            System.out.println(root.adjacent.size());
            if(root==to){
                return true;
            }
            for (Node n : root.adjacent){

                if(n.marked == false){
                    n.marked = true;
                    que.add(n);
                }
            }
        }
        return false;
    }
}

/*
class Direction{
    int a = 0;
    public boolean direction(int[][] matrix, int from, int to) {
        int i = 0;
        boolean result = false;
        if(i < matrix.length){
            i++;
            Integer[] list = Arrays.stream(matrix[from]).boxed().toArray(Integer[]::new);
            from = Arrays.asList(list).indexOf(1);
            System.out.println(matrix[from][to]);
            if(matrix[from][to]==1){
                result = true;
            }
            direction(matrix,from,to);
            return false || result;
        }

        return result;
            }
}

*/

