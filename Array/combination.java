package Array;

/**
 * Created by piyush.bajaj on 16/02/17.
 */
public class combination {
    public void combinationString(String str){
        combinationOne("", str);
    }

    public void combinationOne(String prefix, String str){
        if(str.length() > 0){
            System.out.println(prefix + str.charAt(0));
            combinationOne(prefix + str.charAt(0), str.substring(1));
            combinationOne(prefix, str.substring(1));
        }


    }

    public static void main(String[] args) {
        combination com = new combination();
        com.combinationString("piy");
        //String str = "piyush";
        //String a = str.substring(1);
    }
}
