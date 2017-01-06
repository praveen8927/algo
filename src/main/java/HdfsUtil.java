//
//import java.io.*;
//import java.net.URI;
//import java.net.URISyntaxException;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.FileSystem;
//import org.apache.hadoop.fs.Path;
//
//public class HdfsUtil {
//
//
//    public static void hdfsCopy(String test) throws IOException, URISyntaxException
//    {
//        //1. Get the instance of COnfiguration
//        Configuration configuration = new Configuration();
//        //2. Create an InputStream to read the data from local file
//        //  InputStream inputStream = new BufferedInputStream(new FileInputStream("/home/client/localsystem/file/path/sample.txt"));
//        //3. Get the HDFS instance
//
//        FileSystem hdfs = FileSystem.get(new URI("hdfs://gold"), configuration);
//        //4. Open a OutputStream to write the data, this can be obtained from the FileSytem
//
//        Path path  = new Path("/projects/dwh/testData1/part.txt");
//
////        BufferedReader bfr=new BufferedReader(new InputStreamReader(hdfs.open(path)));     //open file first
////        String str = null;
//        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(hdfs.create(path,true)));
//
////        while ((str = bfr.readLine())!= null)
////        {
////            br.write(str); // write file content
////            br.newLine();
////            System.out.println("   ->>>>>  "+str);
////            System.out.println(" >>>>>" + test);
////        }
//        System.out.println(" >>>>>" + test);
//        br.append(test);  // append into file
//        br.newLine();
//        br.close();
//    }
//
//    public static void main(String[] args) throws IOException, URISyntaxException {
//        hdfsCopy("test");
//    }
//}
