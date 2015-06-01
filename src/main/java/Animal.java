/**
 * Created by praveen.adlakha on 08/02/15.
 */
public abstract class Animal{
    private int order;
    protected String name;
    public Animal(String n){
        name=n;
    }

    public void setOrder(int or){
        order=or;
    }

    public String getOrder(){
        return name;
    }

    public boolean isOlderThan(Animal a){
        return this.order < a.order;
    }
}