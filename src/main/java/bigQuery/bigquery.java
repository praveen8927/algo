package bigQuery;

/**
 * Created by praveen on 29/12/16.
 */
public class bigquery {
    public static void main(String[] args) {
        String str = "bq load --source_format=NEWLINE_DELIMITED_JSON --max_bad_records 10000 -E 'UTF-8' --null_marker '\\N'  'test_yoda.summary1_event$20161226' gs://dimtable_storage/summary1/summary1/process_event/part-00010.gz";

        String str1 = "hdfs dfs -cp /projects/dwh/analytics/summary2/process_event/part-00010.gz gs://dimtable_storage/summary2/process_event/";

        loadcommand(str);

    }

    public static void loadcommand(String str){

        for(int i=1;i<=10;i++){
            String str1 = str.replace("part-00010.gz","part-0000"+i+".gz");
            System.out.println(str1);
        }

        for(int i=11;i<100;i++){
            String str1 = str.replace("part-00010.gz","part-000"+i+".gz");
            System.out.println(str1);
        }

        for(int i=101;i<=109;i++){
            String str1 = str.replace("part-00010.gz","part-00"+i+".gz");
            System.out.println(str1);
        }
    }
}
