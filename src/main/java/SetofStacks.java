//import java.util.ArrayList;
//
///**
// * Created by praveen.adlakha on 08/02/15.
// */
//public class SetofStacks {
//    public ArrayList<Stack> stacks = new ArrayList<Stack>();
//
//    public void push(int v){
//    Stack last = getLastStack();
//        if(last !=null && !last.isFull()){
//            last.push(v);
//        }
//        else{
//            Stack stack = new Stack();
//            stack.push(v);
//            stacks.add(stack);
//        }
//
//    }
//
//    public int pop(){
//        Stack last = getLastStack();
//        int v = last.pop();
//        if(last.size == 0){
//            stacks.remove(stacks.size()-1);
//        }
//        return (int) v;
//    }
//
//    public Stack getLastStack(){
//        if(stacks.size()==0){
//            return null;
//        }
//        else return (stacks.get(stacks.size()-1));
//    }
//
//    public boolean isEmpty(){
//        Stack last = getLastStack();
//        return last==null || last.isEmpty();
//    }
//}
