import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by praveen.adlakha on 08/02/15.
 */
public class GenericMethodTest {
    // generic method printArray
    public static < G > void printArray( G[] inputArray )
    {
        // Display array elements
        for ( G element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main( String args[] ) throws URISyntaxException
    {

        String path = "hdfs://10.14.118.114:8020/user/dataqa/";
    //    path = "/user/dataqa/";

        URI abc = new URI(path);
//        System.out.println( abc.getHost() + ":" + abc.getPort()  );
        System.out.println( "Authority " +abc.getAuthority());
//        System.out.println(abc.getQuery());
        System.out.println(abc.getScheme());
        System.out.println(abc.getSchemeSpecificPart());
        System.out.println(abc.getPath());
        System.out.println(abc.getScheme() + "://" + abc.getAuthority());

    }
}
