package pattern.design.first.head;

/**
 * Created by praveen.adlakha on 31/05/15.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
