package project.euler;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by praveen.adlakha on 10/02/15.
 */
public class Problem1 {
    public static void main(String[] args) {
        LinkedList<Integer> set = new LinkedList<Integer>();
        int a=5,b=3,sum=0;
        System.out.println( Math.ceil(1000 / 3));
        for(int i=0 ;i<= Math.ceil(1000 / 3);i++){
        int p = (3*i);
        int q = (5*i);
            if(q<1000){
            set.add(q);}
            if(p<1000){
            if(!set.contains(p)){
                set.add(p);
            }
            }
        }
        Iterator iterator = set.iterator();
        for (int i :set){
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println(sum);

    }
}
