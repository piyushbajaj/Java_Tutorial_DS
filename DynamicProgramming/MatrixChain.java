package DynamicProgramming;

/**
 * Created by piyush.bajaj on 04/06/17.
 */
public class MatrixChain {

    public int matrixChainMultiplication(int[] mat){
        int n = mat.length;
        int[][] tab = new int[n][n];
        String[][] loc = new String[n][n];

        for(int i = 0; i < n; i++)
            tab[i][i] = 0;

        for(int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i+l-1;
                tab[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j -1; k++) {
                   int q = tab[i][k] + tab[k+1][j] + mat[i-1]* mat[k] * mat[j];
                    if(q < tab[i][j])
                        tab[i][j] = q;
                }
            }
        }


        return tab[1][n-1];

    }

    public static void main(String[] args) {
        MatrixChain mc = new MatrixChain();
        //{{2,3}, {3,6}, {6,4}, {4,5}};
        int[] mat = {2, 3, 6, 4, 5};
        System.out.println(mc.matrixChainMultiplication(mat));
    }
}
