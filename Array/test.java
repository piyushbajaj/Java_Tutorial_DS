package Array;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by piyush.bajaj on 05/04/17.
 */
public class test {
//    public static void main(String args[]) {
//        //Creating HashSet and adding elements
//        HashSet<String> set = new HashSet<String>();
//        set.add("Ravi");
//        set.add("Vijay");
//        set.add("Ravi");
//        set.add("Ajay");
//        //Traversing elements
//        Iterator<String> itr = set.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//    }

    public static void main(String args[]) {
        //Creating and adding elements
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Ben");
        al.add("Zen");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
