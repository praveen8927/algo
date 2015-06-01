package project.euler;

import java.util.HashSet;

/**
 * Created by praveen.adlakha on 10/02/15.
 */
public class Problem2 {
    public static void main(String[] args) {
        HashSet<Long> set =new HashSet<Long>();
        long p=1,q=2,sum=0,sum1=0;
        for (sum=0;sum<4000000;){
           if((q%2)==0){
            set.add(q);
           }
            sum=p+q;
            p=q;
            q=sum;
        }
        for (Long i :set){
            sum1= sum1+i;
            //System.out.println(i);
        }
        System.out.println(sum1);
    }
}
