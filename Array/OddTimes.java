package Array;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by piyush.bajaj on 22/10/16.
 */
public class OddTimes {
    public int oddNoTimes(int[] a){

        for(int i=0; i < a.length; i++){
            int count=1;
            for(int j=i+1; j < a.length; j++){
                if(a[i] == a[j])
                    count++;
            }
            if(count%2 !=0)
                return a[i];
        }
        return -1;
    }

    public int oddNoTimes_hash(int[] a){
        HashMap<Integer, Integer> hash = new HashMap<>();
        //int count =1;
        //hash.put(a[0], count);
        for(int i = 0; i < a.length; i++){
            if(hash.containsKey(a[i])){
                hash.put(a[i], hash.get(a[i]) + 1);
            }
            else {
                hash.put(a[i], 1);
            }
        }

        Set<Integer> key = hash.keySet();
        for(int i = 0; i <= key.size(); i++){
            if(hash.get(a[i]) % 2 != 0)
                return a[i];
        }
        return -1;

    }

    public int getOddOccurrence(int ar[])
    {
        int i;
        int res = 0;
        for (i = 0; i < ar.length; i++)
        {
            res = res ^ ar[i];
        }
        return res;
    }

    public static void main(String[] args) {
        OddTimes od = new OddTimes();
        int a[] = {1, 2, 3, 3, 1, 2, 1};
        System.out.println("This number occurred odd number of times in the array: " + od.oddNoTimes(a));

        System.out.println("This number occurred odd number of times in the array using HASH technique: "
                + od.oddNoTimes_hash(a));

        System.out.println("This number occurred odd number of times in the array using Bitwise XOR technique: "
                + od.getOddOccurrence(a));
    }
}
