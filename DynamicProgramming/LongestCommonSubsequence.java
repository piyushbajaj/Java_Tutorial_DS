package DynamicProgramming;

/**
 * Created by piyush.bajaj on 26/01/17.
 */
public class LongestCommonSubsequence {
    public int lcs(char[] c1, char[] c2){
        int n1 = c1.length;
        int n2 = c2.length;
        int m = 0;
        int j = 0;

        if(n1 > n2) {
            m = n1;
            j = n2;
        }
        else {
            m = n2;
            j = n1;
        }

        int[] temp = new int[j];
        int k = 0;

        for(int i = 0; i < m; i++){
            if(i < n1 && i < n2){
                if(c1[i] == c2[i])
                    temp[k++] = c1[i];
                else if(c1[i+1] == c2[i])
                    temp[k++] = c1[i+1];
                else if(c1[i] == c2[i+1])
                    temp[k++] = c1[i];
            }
        }
        return -1;
    }

    public int lcs_better(char[] c1, char[] c2){
        int n1 = c1.length;
        int n2 = c2.length;
        int l =0;

        //lcs_util(c1, c2, n1-1, n2-1, l);

        return -1;

    }

    public int lcs_util(char[] c1, char[] c2, int n1, int n2){
        if(c1[n1] == c2[n2]) {
           return lcs_util(c1, c2, n1 - 1, n2 - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        LongestCommonSubsequence LC = new LongestCommonSubsequence();
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        LC.lcs(s1.toCharArray(), s2.toCharArray());
    }
}
