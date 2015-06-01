import java.util.LinkedList;

/**
 * Created by praveen.adlakha on 08/02/15.
 */
public class AnimalQueue {

    public class Dogs extends Animal{
        public Dogs(String n){
            super(n);
        }
    }

    public class Cats extends Animal{
        public Cats(String n){
            super(n);
        }
    }

    LinkedList<Dogs> dogs = new LinkedList<Dogs>();
    LinkedList<Cats> cats = new LinkedList<Cats>();
    private int order = 0;

    public void enqueue(Animal a){

    }

}
