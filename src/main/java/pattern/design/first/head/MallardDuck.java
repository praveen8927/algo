package pattern.design.first.head;

/**
 * Created by praveen.adlakha on 31/05/15.
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    public  MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
}
