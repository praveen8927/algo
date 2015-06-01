/**
 * Created by praveen.adlakha on 02/02/15.
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    final static BillPughSingleton INSTANCE;
    final static BillPughSingleton ONE_MORE_INSTANCE;

    static {
        INSTANCE = new BillPughSingleton();
        ONE_MORE_INSTANCE = LazyHolder.INSTANCE;
    }


    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return INSTANCE;
    }
}




