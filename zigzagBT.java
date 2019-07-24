import java.util.*;

/**
 * class Node is similar to the structures in java
 * the class members are the data left and the right Node
 * we can initialze the node using the constructor
 */
class Node{

    int data;
    Node left;
    Node right;

    Node (int data){
        this.data = data;
    }

}

/**
 * This class is used for the zig-zag traversal of the BT 
 */


public class zigzagBT{
    /**
     * The objects of this class have only one member variable which is the
     * rootNode
     */
    Node rootNode;

    public void printZigZagOrderTraversal(Node root){

        /**
         * We need two Stacks to implement the zigzag traversal
         * a boolean variable leftToRight ( ltr )inorder to indicate the 
         * order of the order of traversal
         * 
         * Init the curr level stack by insertion of the current rootNode
         * 1) We pop elements one by one from the curr level Stack using a while loop
         * 2) print the popped ele
         * 3) then push the nodes to the next Stack depending on the value of the ltr boolean var if the value isn't Null
         * 4) if the currlevel Stack is empty then negate the ltr var
         *      and swap the next and curr stack using temp stack
         * 5) continue with the while loop until the condition current stack !isEmpty() fails
         */
        Stack<Node> currLevel = new Stack<>();// Remember to keep the dtype of the stack as 'Node'
        Stack<Node> nextLevel = new Stack<>();
        currLevel.push(root);
        boolean leftToRight = false;
        while(!currLevel.isEmpty()){
            Node temp = currLevel.pop();

            System.out.println(temp.data);
            if(leftToRight){
                if(temp.left != null){
                    nextLevel.push(temp.left);
                }
                if(temp.right != null){
                    nextLevel.push(temp.right);
                }
            }else{
                if(temp.right != null){
                    nextLevel.push(temp.right);
                }
                if(temp.left != null){
                    nextLevel.push(temp.left);
                }

            }

            if(currLevel.isEmpty()){
                leftToRight = !leftToRight;
                Stack<Node> tmpStack = nextLevel;
                nextLevel = currLevel;
                currLevel = tmpStack;
            }
        }
    
    }
    public static void main(String args[]){
        zigzagBT tree = new zigzagBT();
        tree.rootNode = new Node(1);

        tree.rootNode.left = new Node(2);
        tree.rootNode.right = new Node(3);
        tree.rootNode.left.left = new Node(4);
        tree.rootNode.left.right = new Node(5);
        tree.rootNode.right.left = new Node(6);
        tree.rootNode.right.right = new Node(7);
        tree.printZigZagOrderTraversal(tree.rootNode);        

    }
}