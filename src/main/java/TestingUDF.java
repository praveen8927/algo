//import java.io.IOException;
//
//import org.apache.pig.EvalFunc;
//import org.apache.pig.data.DataType;
//import org.apache.pig.data.Tuple;
//import org.apache.pig.data.TupleFactory;
//import org.apache.pig.impl.logicalLayer.schema.Schema;
//
///**
// * Created by praveen.adlakha on 31/01/15.
// */
//public class TestingUDF extends EvalFunc<Integer> {
//
//    public Integer exec(Tuple input) throws IOException {
//        if (null == input || input.size() != 1) {
//            return null;
//        }
//
//        Integer i = (Integer)input.get(0);
//        return 2*i;
//    }
//
//    public static void main(String[] args) {
//        Direction direction;
//        System.out.println(Direction.NORTH.getOppositeDirection());
//        System.out.println(Direction.valueOf("NORTH"));
//
//    }
//
//}
