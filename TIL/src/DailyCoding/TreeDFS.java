package DailyCoding;

import java.util.ArrayList;

public class TreeDFS {
    public static void main(String[] args) {

        tree node = new tree("1");
        tree rootChild1 = node.addChildNode(new tree("2"));
        tree rootChild2 = node.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));

        ArrayList<String> values = new ArrayList<>();
        values.add(node.getValue());



    }
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}


