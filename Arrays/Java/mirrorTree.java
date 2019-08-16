import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class mirrorTree{

    Node root;

    Node mirror(Node root){

        if(root == null){
            return root;
        }
        else{

            Node leftN = mirror(root.left);
            Node rightN = mirror(root.right);
            
            root.left = rightN;
            root.right = leftN;

            return root;
            
        }
    }

    void inOrder(Node node){
        if(node == null)
            return;
        else{
            inOrder(node.left);
            System.out.print(" " + node.data);
            inOrder(node.right);
        }
    }
    public static void main(String args[]){
        mirrorTree tree = new mirrorTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal: ");

        tree.inOrder(tree.root);
        System.out.println();
        tree.root =  tree.mirror(tree.root);

        System.out.println("Inorder traversal: ");

        tree.inOrder(tree.root);
        System.out.println();

    }
}