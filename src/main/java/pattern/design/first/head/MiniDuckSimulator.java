package pattern.design.first.head;

/**
 * Created by praveen.adlakha on 31/05/15.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
     //   mallard.performFly();
        mallard.performQuack();
        mallard.performFly();
    }
}
