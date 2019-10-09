//This nodeHere class is for creating a stack object
public class Nodehere {
    private int row;
    private int col;
    private String str;
    private boolean[][] isVisited;


    //This is the constructor for creating the Node, containing 4 attributes
    public Nodehere(boolean[][] is, int row0, int col0, String str0) {
        row = row0;
        col = col0;
        str = str0;
        isVisited = copyArray(is);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getStr() {
        return str;
    }

    public boolean[][] isVisited() {
        return isVisited;
    }

    //This copyArray method is for copy array. We can't use clone here.
    private boolean[][] copyArray(boolean visited[][]) {
        int size = visited[0].length;
        boolean[][] result = new boolean[size][size];
        for (int row = 0; row < size; row++) {
            System.arraycopy(visited[row], 0, result[row], 0, size);
        }
        return result;

    }


}
