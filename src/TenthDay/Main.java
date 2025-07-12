package TenthDay;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(20);
        addNode(root, 14);
        addNode(root, 23);
        addNode(root, 11);
        addNode(root, 16);
        addNode(root, 22);
        addNode(root, 27);
        addNode(root, 5);
        addNode(root, 15);
        addNode(root, 18);
        addNode(root, 24);
        addNode(root, 150);
        addNode(root, 8);
        printTree(root);
    }

    public static void addNode(Node root, int data) {
        if(root.data > data){
            if(root.left == null) root.left = new Node(data);
            else addNode(root.left, data);
        }
        else{
            if(root.right == null) root.right = new Node(data);
            else addNode(root.right, data);
        }
    }

    public static void printTree(Node root) {
        if(root.left != null) printTree(root.left);
        System.out.println(root.data);
        if(root.right != null) printTree(root.right);
    }
}
