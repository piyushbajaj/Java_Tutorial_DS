package CrackingCoding.Array;

import java.util.Scanner;

/**
 * Created by piyush.bajaj on 19/11/16.
 */
public class ReverseArray {
    public static void reverseArr(char[] ch){
        int n = ch.length;
        char temp;
        for(int i = 0; i < n; i++){
            if((i != n-1-i) && i < n/2){
                temp = ch[i];
                ch[i] = ch[n-1-i];
                ch[n-1-i] = temp;
            }
            else break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input the string to be reversed: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] charArr = str.toCharArray();
        reverseArr(charArr);
        String st = String.valueOf(charArr);
        System.out.println(st);
    }
}
