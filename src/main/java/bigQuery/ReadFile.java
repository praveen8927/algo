package bigQuery;

import java.io.*;
import java.util.*;

/**
 * Created by praveen on 24/12/16.
 */
public class ReadFile {
    static Map<String,String> fieldMapping = new HashMap<String, String>();
    static List<String> sumaryList = new ArrayList<String>();

    public ReadFile (){
        String file = new String("/home/praveen/git/algo/src/resources/downloadsummary1.schema");
        initSummary(file);
        File file1  = new File("/home/praveen/git/yoda-pipelines/pipelines/src/main/resources/SummaryToProto.properties");

    }
    public static void main(String[] args) throws IOException {

//        ReadFile readFile = new ReadFile();
        File file = new File("/home/praveen/git/algo/src/resources/downloadsummary1.schema");
        initSummaryMap(file);
        File file1 =  new File("/home/praveen/git/yoda-pipelines/pipelines/src/main/resources/SummaryToProto.properties");
        initFieldMap(file1);
        generateSchema();
        //script();
    }

   static void script(){
       for(int i=0 ;i < 10;i++){
           StringBuilder str = new StringBuilder(" bq load --source_format=NEWLINE_DELIMITED_JSON --max_bad_records 10000 -E 'UTF-8' --null_marker '\\N'  'test_yoda.downloadunmatch_raw' gs://dimtable_storage/download_unmatched/download_unmatched/part-m-0000");
           System.out.println(str.append(Integer.toString(i)));
       }

        for(int i=10 ;i < 86;i++){
            StringBuilder str = new StringBuilder(" bq load --source_format=NEWLINE_DELIMITED_JSON --max_bad_records 10000 -E 'UTF-8' --null_marker '\\N'  'test_yoda.downloadunmatch_raw' gs://dimtable_storage/download_unmatched/download_unmatched/part-m-000");
            System.out.println(str.append(Integer.toString(i)));
        }
    }

    public static void generateSchema(){
        StringBuilder str = new StringBuilder();
        for(String field: sumaryList){
            String string = fieldMapping.get(field);
            str.append(string).append(" AS ").append(field).append(",").append(" ");
        }
        System.out.println(">>>>>>>>");
        str.insert(0,"T1 = FOREACH NOB GENERATE ");
        str.setLength(str.length()-2);
        str.append(";");
        str.append("\n");
        str.append("\n");
        str.append("STORE T1 INTO '$output' USING JsonStorage();");
        System.out.println(str.toString());
    }

    private static void readFile1(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            if(line.endsWith(".gz") && !line.contains("Trash")){
                String word = line.substring(line.indexOf("/")+19,line.lastIndexOf("/")-20);
                System.out.println( "bq load -F '~'  -E 'UTF-8' --null_marker '\\N' --max_bad_records 100  test_yoda."+word +line);
            }
        }

        br.close();
    }


    private static void initSummaryMap(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            sumaryList.add(line);
        }
        //System.out.println(sumaryList.toString());

        br.close();
    }


    private static void initFieldMap(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ":");
            fieldMapping.put(st.nextToken(), st.nextToken());
        }
        //System.out.println(fieldMapping.toString());

        br.close();
    }


    public static void initFieldMapping(String fileName, String summaryType) {
        try {
            synchronized (fieldMapping) {
                InputStream inputStream = ReadFile.class.getClassLoader().getResourceAsStream(fileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String fieldMap;
                while ((fieldMap = reader.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(fieldMap, ":");
                    fieldMapping.put(st.nextToken(), st.nextToken());
                }
                reader.close();
                inputStream.close();
            }
//            validateKeyLessNetworkObject(summaryType);
        } catch (Exception e) {
            throw new RuntimeException("Failed to init lens to yoda field mapping," + e.toString());
        }
    }

    public void initSummary(String fileName){
        try {
            synchronized (fieldMapping) {
                InputStream inputStream =  this.getClass().getResourceAsStream(fileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String fieldMap;
                while ((fieldMap = reader.readLine()) != null) {
                sumaryList.add(fieldMap);
                }
                reader.close();
                inputStream.close();
            }
            System.out.println(sumaryList.toArray());
//            validateKeyLessNetworkObject(summaryType);
        } catch (Exception e) {
            throw new RuntimeException("Failed to init lens to yoda field mapping," + e.toString());
        }
    }
}
