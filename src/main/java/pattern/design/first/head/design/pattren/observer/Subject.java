package pattern.design.first.head.design.pattren.observer;

/**
 * Created by praveen.adlakha on 01/06/15.
 */
public interface Subject {
    public void registerObserver(Observer o );
    public void removeObserver(Observer o);
    public void notifyObservers();
}
