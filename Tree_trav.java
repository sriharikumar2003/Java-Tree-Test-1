class Node{
    int val;
    Node left,right;

    public Node(int item){
        val = item;
        left = right = null;
    }
}

public class Tree_trav {
    Node root;
    public static void main(String[]args) {
        Tree_trav tree = new Tree_trav();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(9);
        tree.root.left.left.right.left= new Node(1);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right.left = new Node(8);
        System.out.print("Inorder: ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("Preorder: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("Postorder: ");
        tree.postOrder(tree.root);
        System.out.println();
    }

    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        inOrder(node.left);
        inOrder(node.right);
    }
    void postOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.val + " ");
    }
}
