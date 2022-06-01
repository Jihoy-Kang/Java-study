package Seb;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BSTAlgorithm {
    public static void main(String[] args) {
        int[] stuff = new int[]{
                42, 25, 60, 73, 103, 167, 60
        };
        int limit = 187;
        int box = 0;
        Arrays.sort(stuff);
        Gtree t = new Gtree();
        t.makeTree(stuff);

        //가장 무거운물건과 가장가벼운 물건을 매칭하는데 이때 박스의무게를 초과해선안되고 남는공간도 최소화해야한다.
        //박스에 담기면 박스 개수 카운트
        /*
         * 1. 리스트를 생성하여 최대값을 구한다.
         *   1-1 작업할 리스트를 만든다. que linkedList
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


        Queue<Integer> queue = new LinkedList<>();

        queue.add(t.findMax(t.root));
        t.delete(t.findMax(t.root));
        while(!queue.isEmpty()){
            box++;
            System.out.println("박스개수 : " + box);
            int max = queue.poll(); // 큐에 있는 최대값 변수에 할당
            System.out.println("max : "+max);
            int min = t.findMin(t.root); // 트리 내 최소값 변수에 할당
            System.out.println("min : "+min);
            int find = limit - max;
            System.out.println("find : "+find);
            int near = t.searchGtree(t.root,find);
            System.out.println("near : "+near);
            if(find > min){
                t.delete(near);
            }
            t.inorder(t.root);

            if(t.root != null){
                queue.add(t.findMax(t.root));
                t.delete(t.findMax(t.root));
            }

            System.out.println("--------------------------------------------------------------------");
        }




       /* t.searchGtree(t.root, 25);
        t.delete(t.root.left.data);
        t.inorder();*/


    }
}
/*
 * 2진트리만들기
 * 1. 정렬된 자연수의 배열
 * 2. node 생성
 * 2. 가운데 수를 구한다.(만약 두개면 앞에있는 숫자를 root로 지정)
 * 3. 시작인덱스, 중간인덱스를구한다, 끝나는인덱스를 구한다.
 * */

class Gtree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    public void makeTree(int[] array){
        root = makeTreeR(array, 0, array.length-1);
    }
    public Node makeTreeR(int[] array, int start, int end){
        if (start > end) return null;
        int mid = (start+end)/2;
        Node node = new Node(array[mid]);
        node.left = makeTreeR(array, start, mid-1);
        node.right =makeTreeR(array, mid+1,end);
        return node;
    }
    public int searchGtree(Node n, int find){
        if(find == n.data){
            return n.data;
        }else if(find <n.data){
            if(n.left == null){
                System.out.println("근사값L : " + n.data);
                return n.data;
            }else{
                System.out.println("Data is Smaller than " + n.data);
                searchGtree(n.left, find);
            }
        }else if(find > n.data){
            if(n.right == null || find < n.right.data){
                System.out.println("근사값R : " + n.data);
                return n.data;
            }else{
                System.out.println("Data is Bigger than " + n.data);
                searchGtree(n.right, find);
            }
        }
        return n.data;
    }


    public void delete(int data){
        root = delete(root, data);
    }
    private Node delete(Node root, int data){
        if(root==null) return root;
        if(data < root.data){
            root.left = delete(root.left,data);
        }else if(data>root.data){
            root.right = delete(root.right,data);
        }else{
            if(root.left == null && root.right == null) return null;
            else if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    int findMin(Node root){
        int min = root.data;
        while(root.left != null){
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    int findMax(Node root){
        int max = root.data;
        while(root.right != null){
            max = root.right.data;
            root = root.right;
        }
        return max;
    }
    public void inorder(){
        inorder(root);
        System.out.println("");
    }
    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }
}
