package SolidMaster.single_responsibility.good.src;

import java.util.ArrayList;

/**
 * Created by mrk on 4/7/14.
 */
public class Board {
    public int size;
    public ArrayList<String> spots;

    public Board(int size) {
        this.size = size;
        this.spots = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            this.spots.add(String.valueOf(3*i));
            this.spots.add(String.valueOf(3*i + 1));
            this.spots.add(String.valueOf(3*i + 2));
        }
    }

    public ArrayList<String> valuesAt(ArrayList<Integer> indexes) {
        ArrayList<String> values = new ArrayList<String>();

        for (int index : indexes) {
            values.add(this.spots.get(index));
        }

        return values;
    }

    public static void main(String[] args) {
        Board board = new Board(3);
        BoardShaper boardShaper = new BoardShaper(3);
        BoardPresenter boardPresenter = new BoardPresenter(board);
        ArrayList<ArrayList<Integer>> arr = boardShaper.rowIndexes();
        boardPresenter.displayBoard();

        System.out.println(arr);
    }
}
