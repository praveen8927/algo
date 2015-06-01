///**
// * Created by praveen.adlakha on 31/01/15.
// */
//public class Stack  {
//    Node int top;
//    int size = 0;
//
//
//    int pop() {
//        if (top == null) {
//            return null;
//        } else {
//            int item = top.data;
//            top = top.link;
//            size=size-1;
//            return item;
//        }
//
//    }
//
//    public void push(T item) {
//        //System.out.println(item);
//        Node t = new Node(item);
//        t.link = top;
//        top = t;
//        size=size+1;
//        //System.out.println(top.data);
//    }
//    public boolean isFull(){
//        if (size == 5){
//            return true;
//        }
//        else {
//           return false;
//        }
//    }
//
//    T peek() {
//        if(top == null){return null;}
//        return top.data;
//    }
//
//    public boolean isEmpty(){
//        if(size==0){
//            return true;
//        }
//        else return false;
//    }
////
////    public Stack sort(){
////        Stack s = this;
////        Stack sort = new Stack();
////        if(s.isEmpty()){
////            return null ;
////        }
////        while(!s.isEmpty()){
////            int tmp =s.pop();
////
////
////        while(!sort.isEmpty() && sort.peek() >tmp){
////            s.push(sort.pop());
////        }
////         sort.push(tmp);
////
////    }
////        System.out.println(sort.peek());
////        return sort;
////    }
//
//
//
//
//}
//
//
//class StackUsage {
//
//
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(6);
//        stack.push(20);
//        stack.push(30);
//       // Stack s1=stack.sort();
//        //System.out.println(s1.peek());
//    }
//
//}
