package Seb;

import java.util.Arrays;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        int[] stuff = new int[]{
                42, 25, 60, 73, 103, 167, 60
        };
        int limit = 187;
        int box = 0;
        Arrays.sort(stuff);
        Gtree t = new Gtree();
        t.makeTree(stuff);
        System.out.println(t.findMin(t.root));
        System.out.println(t.findMax(t.root));
        //가장 무거운물건과 가장가벼운 물건을 매칭하는데 이때 박스의무게를 초과해선안되고 남는공간도 최소화해야한다.
        //박스에 담기면 박스 개수 카운트





        t.searchGtree(t.root, 25);
        t.delete(60);
        t.inorder();


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
            if(n.left != null){
                System.out.println("Data is Smaller than " + n.data);
                searchGtree(n.left, find);
            }
            System.out.println("근사값 : " + n.data);
            return n.data;

        }else if(find > n.data){
            if(n.right != null){
                System.out.println("Data is Bigger than " + n.data);
                searchGtree(n.right, find);
            }
            System.out.println("근사값 : " + n.data);
            return n.data;
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

    public int countBox(Node root, int limit){
        int min = findMin(root);
        int max = findMax(root);
        int box = 0;
        int rest = 0;
        if(root == null) return box;
        if (limit == min+max) {
            box++;
            delete(max);
            delete(min);
        }else if(limit < min+max){
            box++;
            delete(max);
        }else{
            rest = limit - (min + max);
            delete(max);
            delete(min);
    }
}
