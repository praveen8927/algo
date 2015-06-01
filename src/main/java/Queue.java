/**
 * Created by praveen.adlakha on 31/01/15.
 */
public class Queue {
    Node first,last;

    void enqueue(Integer item){
        Node node = new Node(item);
        if(first==null){
            first=node;
            last=node;
        }
        else{
            last.link=node;
            last=last.getLink();
        }
    }

    Integer dequeue(){
        if(first==null){
            last=null;
            return null;
        }
        else{
            //Integer data=first.data;
            first=first.getLink();
            //return data;
            return null;
        }
    }
}

class QueueUsage{

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
