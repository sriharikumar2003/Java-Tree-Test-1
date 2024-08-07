import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class TreeTraverse {
    Node root;
    public static void main(String[]args){
        TreeTraverse Tree = new TreeTraverse();
        Tree.root = new Node(1);
        Tree.root.left = new Node(2);
        Tree.root.right = new Node(3);
        Tree.root.left.left = new Node(4);
        Tree.root.left.right = new Node(5);
        Tree.root.right.left = new Node(6);
        Tree.root.right.right = new Node(7);
        Tree.root.left.right.left = new Node(8);
        Tree.root.right.right.left = new Node(9);
        Tree.root.right.right.right = new Node(10);
        System.out.println("Pre-order:");
        Tree.preOrder(Tree.root);
        System.out.println();
        System.out.println("In-order:");
        Tree.inOrder(Tree.root);
        System.out.println();
        System.out.println("Post-order:");
        Tree.postOrder(Tree.root);
        System.out.println();
    }
    void preOrder(Node node){
        if(node == null){
            return ;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(Node node){
        if(node == null){
            return ;
        }
        preOrder(node.left);
        System.out.print(node.data + " ");
        preOrder(node.right);
    }
    void postOrder(Node node){
        if(node == null){
            return ;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data + " ");
    }
}
