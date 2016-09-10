package codemonk.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by praveen.adlakha on 9/10/16.
 */
public class BinaryTreeUtil {

    public static BinaryTreeNode insertData(int data,BinaryTreeNode root){
        if(root == null){
            root = new BinaryTreeNode(data);
            System.out.println("Inserted:"+ data);
            return root ;
        }else{
            if(root.getData() <= data){
                root.setRight(insertData(data,root.getRight()));
            }
            if(root.getData() > data){
                root.setLeft(insertData(data,root.getLeft()));
            }
            return root;
        }
    }

    public static int findMaximum(BinaryTreeNode root){
        int max = -999,leftMax,rightMax;
        if(root == null){
            return max;
        }else{
            leftMax = findMaximum(root.getLeft());
            rightMax = findMaximum(root.getRight());
            if(leftMax > rightMax){
                max = leftMax;
            }else {
                max = rightMax;
            }
            if(root.getData() > max){
                max = root.getData();
            }
        }
        return max;
    }

    public static int findMaxmimumWithoutRecursion(BinaryTreeNode node){
        int max = -999;
        Queue queue = new LinkedList();
        queue.add(node);
        BinaryTreeNode temp;
        while(!queue.isEmpty()){
            temp = (BinaryTreeNode) queue.remove();
//            System.out.println("tmp data:" + temp.getData());
            if(max < temp.getData()){
                max = temp.getData();
            }
            if(temp.getLeft() != null){
                queue.add(temp.getLeft());
            }
            if(temp.getRight() != null){
                queue.add(temp.getRight());
            }
        }
        return max;
    }

    public static Boolean findNumberwithRecursion(int data, BinaryTreeNode node) {
        if(node.getData() == data){
            return true;
        }else{
            if( node.getRight() != null && data <= node.getRight().getData()){
                return findNumberwithRecursion(data,node.getRight());
            }if( node.getLeft() != null && data > node.getLeft().getData()){
                return findNumberwithRecursion(data,node.getLeft());
            }
        }
        return false;
    }

    public static Boolean findNumberWithoutRecursion(int data, BinaryTreeNode node){
        if(node.getData() == data){
            return true;
        }
        else{
            Queue queue = new LinkedList();
            queue.add(node);
            BinaryTreeNode temp ;
            while (!queue.isEmpty()){
               temp = (BinaryTreeNode) queue.remove();
               if(temp.getRight() != null){
                   queue.add(temp.getRight());
               }
               if(temp.getLeft() != null){
                   queue.add(temp.getRight());
               }
               if(temp.getData() != data){
                   queue.remove(temp);
               }
                if(temp.getData() == data){
                    return true;
                }
            }
            return false;
        }
    }
}
