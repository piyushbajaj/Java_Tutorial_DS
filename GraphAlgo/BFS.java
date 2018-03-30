package GraphAlgo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by piyush.bajaj on 09/01/17.
 * Algorithm for Graph:
 * 1. Create a variable V, which will store actual number of vertices.
 * 2. Create a variable vertexCount, which will keep increments as the vertex gets added.
 * 3. Create a Linked List array adjList[] to store a list of array.
 * 4. Create Queue as this is BFS.
 * 5. Create a class Vertex, which will contain label and boolean visited.
 * 6. Now create an array of Vertex class as vertexList[]
 * 7. Create a function addVertices(char v), which will add new vertex to the vertex List array.
 *      vertexList[vertexCount++] = new Vertex(v);
 * 8. Create a function addEdges(int i, int j), which will keep adding new edges to the edges list.
 *          adjList[i].add[j];
 *          adjList[j].add[i];
 * 9. Now hit the BFS():
 *      a. for(int i = 0; i < V; i++)
 *          if(vertexList[i].visited == false)
 *              BFS_Util(int ver);
 *
 * 10. Create BFS_Util(int v){
 *     queue.add(v);
 *     vertexList[v].visited = true;
 *     System.out.println(vertexList[v].label);
 *
 *     while(!queue.isEmpty){
 *         int temp1 = queue.remove;
 *         while((temp2 = nextElement(temp1))!=-1){
 *             System.out.println(vertexList[temp2].label);
 *             queue.add(temp2);
 *             vertexList[temp2].visited = true;
 *
 *         }
 *     }
 *
 * }
 *
 * 11. public int nextElement(int v){
 *     for(int i = 0; i < V; i++){
 *         if(adjList[v].contains(i) && vertexList[v].visited == false)
 *          return i;
 *         return -1;
 *     }
 * }
 *
 * 12. Time Complexity: O(E+V)
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

    //public void BFS_Function


}
