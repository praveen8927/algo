package pattern.design.first.head;

/**
 * Created by praveen.adlakha on 31/05/15.
 */
public abstract class Duck {

    FlyBehaviour flyBehaviour ;
    QuackBehaviour quackBehaviour;
    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.printf("All ducks float,even decoys");
    }


}
