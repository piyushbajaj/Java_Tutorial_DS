package GraphAlgo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by piyush.bajaj on 09/01/17.
 */
public class BFS {

    private int V; //Actual number of vertex
    private int vertexCount; //Will keep incrementing as vertex gets added
    private LinkedList<Integer> adjList[]; //To keep list of connections
    private Vertex vertexList[]; //To keep vertex as a list of array
    private Queue<Integer> queue = new LinkedList<>();

    public class Vertex{
        public char label;
        public boolean visited;

        public Vertex(char lab){
            label = lab;
            visited = false;
        }
    }

    public void addVertices(char v){
        vertexList[vertexCount++] = new Vertex(v);
    }

    public void addEdge(int i, int j){
        adjList[i].add(j);
    }

    public BFS(int vertex){
        V = vertex;
        vertexCount = 0;
        vertexList = new Vertex[V];
        adjList = new LinkedList[V];
        queue = new LinkedList<Integer>();

        for(int i = 0; i < V; i++)
            adjList[i] = new LinkedList<>();
    }

    public void BFS_Function(){

        for(int i = 0; i < V; i++){
            if(vertexList[i].visited == false)
                BFS_Util(i, vertexList[i].visited);
        }

        for(int i = 0; i < V; i++){
            vertexList[i].visited = false;
        }
    }

    public void BFS_Util(int ver, boolean visited){
        //Mark the node as visited
        vertexList[ver].visited = true;
        System.out.print(vertexList[ver].label + " ");
        queue.add(ver);
        int temp2=0;

        while (!queue.isEmpty()){
            int temp1 = queue.remove();
            while ((temp2 =nextElement(temp1))!=-1){
                vertexList[temp2].visited = true;
                System.out.print(vertexList[temp2].label + " ");
                queue.add(temp2);
            }
        }

    }

    public int nextElement(int v){
        for(int i = 0; i < V; i++)
            if(adjList[v].contains(i) && vertexList[i].visited==false)
                return i;
            return -1;
    }

    public static void main(String[] args) {
        BFS g = new BFS(8);

        g.addVertices('A');
        g.addVertices('B');
        g.addVertices('C');
        g.addVertices('D');
        g.addVertices('E');
        g.addVertices('F');
        g.addVertices('H');
        g.addVertices('G');



        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 6);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 7);

        System.out.println("Following is Breadth First Traversal");

        g.BFS_Function();
    }


}
