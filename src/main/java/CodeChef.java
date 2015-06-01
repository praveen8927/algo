import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by praveen.adlakha on 08/02/15.
 */
public class CodeChef {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        char c='y';

        while(c=='y'){
        System.out.println("Enter the input in int:");
        Scanner scanner = new Scanner(System.in);
        linkedList.add(scanner.nextInt());
        System.out.println("Want to enter more :");
        c = scanner.next().charAt(0);
        //System.out.println(linkedList.listIterator(1));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
            if(linkedList.get(i) == 42){
                break;
            }
        }

    }
}
