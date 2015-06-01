import java.util.Stack;

/**
 * Created by praveen.adlakha on 28/02/15.
 */
public class BinarySearchTree {
    public enum State{
        Visited,Unvisited,Visiting;
    }

    static class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }

        public void setLeft(Node n){
            this.left=n;
        }
        public void setRight(Node n){
            this.right = n;
        }
        public Node getLeft(){
           return this.left;
        }
        public Node getRight(){
            return this.right;
        }
        public int getData(){
            return this.data;
        }
        public boolean equals(Node n){
            if(this.getData() == n.getData()){
                return true;
            }
            return false;
        }



    }

    public static void main(String[] args) {
        BinarySearchTree bts = new BinarySearchTree();
        bts.run();
    }
    public void run(){
        Node root = new Node(10);
        insert(root,new Node(20));
        insert(root,new Node(5));
        insert(root,new Node(4));
        insert(root,new Node(24));
        insert(root,new Node(15));

        //inOrderTraversal(root);
        findPath(root,54);
       // System.out.println("\n" + binarySearch(root,new Node(10)));
       // System.out.println("\nIs Balanced" + isBalanced(root));
    }

    public void insert(Node root,Node n){
        if (root == null || n == null){
            return;
        }
        if(root.getData() > n.getData()){
            if(root.left == null ){
                root.setLeft(n);
                System.out.println("Added to the left of "+root.getData()+" of value"+n.getData());
            }
            else {
                insert(root.getLeft(),n);
            }

        }
        if (root.getData() < n.getData()){
            if(root.right == null){
                root.setRight(n);
                System.out.println("Added to the right of "+root.getData()+" of value"+n.getData());
            }
            else{
                insert(root.getRight(),n);
            }
        }
    }

    public void inOrderTraversal (Node root){
        if(root != null){
            inOrderTraversal(root.getLeft());
            System.out.println(" " + root.getData());
            inOrderTraversal(root.getRight());
        }
    }

    public boolean binarySearch(Node root,Node n){
        if(root==null || n== null){
            return false;
        }
        if(root.getData() < n.getData()){
            return binarySearch(root.getLeft(),n);
        }
        else if(root.getData() > n.getData()){
            return binarySearch(root.getRight(),n);
        }
        return true;
    }

    public int checkHeight (Node root){
        if (root == null){
            return 0;
        }

        int leftHeight = checkHeight(root.getLeft());
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = checkHeight(root.getRight());
        if(rightHeight == -1){
            return -1;
        }

        if(leftHeight-rightHeight >0){
            return -1;
        }
        else return Math.max(leftHeight,rightHeight)+1;
    }

    public boolean isBalanced(Node n){
        if(checkHeight(n)==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public void findPath(Node root,int sum){

        if( root == null || root.getData() > sum ){
            return;
        }
        if(sum-root.getData() == 0){
            System.out.println("\npath found "+root.getData());
        }
        else { findPath(root.getLeft(),sum-root.getData());
            System.out.println("\n"+root.getData());
               findPath(root.getRight(),sum-root.getData());
            //System.out.println("\n"+root.getData());
        }

    }

}
