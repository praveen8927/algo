import  java.util.*;
/**
 * Created by praveen.adlakha on 10/01/15.
 */
public class CodingInterview {

    public static boolean checkForUnique(String str){
       HashSet hashSet = new HashSet(str.length());

        for (char c : str.toCharArray()){
            if(!hashSet.add(Character.toLowerCase(c)))
                return false;
        }
        return  true;
    }

    public static boolean checkForUnique2(String str){
        boolean [] strSet  = new boolean[256];

        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            System.out.println(val);
            if(strSet[val]){ //if its already true
                return false;
        }
            strSet[val] = true;
        }
        return true;

    }

    public static String sort(String s){
        char[] content =s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static boolean permutation(String s,String t){

        if(s.length() != t.length()){return false;}
        return sort(s).equals(sort(t));

    }

    public static void stringCompression(){
        String s="aaabbc";
        int count=0;
        String mystr="";
        char last = s.charAt(0);
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)== last){
                count++;
            }
            else {
                mystr += last+""+count;
                last = s.charAt(i);
                count=1;

            }

        }
        System.out.println(mystr+last+count);

    }
    public static void setzeros(){
        List <Integer> row = new ArrayList<Integer>();
        List <Integer> columns = new ArrayList<Integer>();

        int [][] matrix = {{1,2,3},
                {0,4,5},
                {6,7,0}};
        //System.out.println(matrix[2][1]);

        for (int i=0;i<matrix.length;i++ ){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    columns.add(j);
                }
            }

        }

        for (int i=0;i<matrix.length;i++ ){
            for (int j=0;j<matrix[0].length;j++){

                //System.out.println(row.get(i)+"i="+i);

                if(row.contains(i) ){
                for (int p =0;p<matrix[0].length;p++){
                    matrix[i][j]=0;
                  //  System.out.println(matrix[i][j]);
                }
            }

            }
        }
        for (int i=0;i<matrix.length;i++ ){
            for (int j=0;j<matrix[0].length;j++){

                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
       // System.out.println(row.get(1));
        //System.out.println(columns);
    }
    public static void main(String[] args) {
       //boolean a = checkForUnique("aaxyzb");
       //boolean b = checkForUnique2("pqrst");
       // System.out.println(b);
       // System.out.println(permutation("abcd", "dcbaf"));
        stringCompression();
       // setzeros();
    }
}
