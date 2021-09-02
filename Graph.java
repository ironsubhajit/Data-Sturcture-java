import java.util.*;

public class Graph {
    private LinkedList<Integer> adj[];

    // Graph Object Constructor
    public Graph(int v){
        // Initializing "adj" Array of LinkedList of size, no of vertices
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    // Add edge to the Bi-directional Graph
    public void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

// =============================================================================================
//    Searching Algorithms BFS and DFS                                                        ||
// =============================================================================================
//  Bug: Trapped in a infinite loop for a cyclic graph path
    public int bfs(int source, int destination){
        boolean[] vis = new boolean[adj.length]; // visited node array
        int[] parent = new int[adj.length]; // Each nodes parent array

        Queue<Integer> q = new LinkedList<>();

        q.add(source); // add source to queue
        parent[source] = -1; //mark -1 as roots parent
        vis[source] = true; // mark source as visited node
        int curr = 0;
        while(!q.isEmpty()){
            curr = q.poll();
            if (curr == destination) break;
            // if destination not found visit neighbour nodes from adj array
            for(int neighbor: adj[curr]){
                if (!vis[neighbor]) {
                    q.add(neighbor); // add neighbors to the queue
                    vis[neighbor] = true; // update neighbors as visited
                    parent[neighbor] = curr; // set curr as parent of neighbor
                }
            }
        }

        // return  0 if destination not found
        if(curr != destination){
            System.out.println("Destination Not found.");
            return 0;
        }

        int dis = 0; // Initialize distance
        // Printing path to destination
        while(parent[curr] != -1){
            System.out.print(curr+" <- ");
            curr = parent[curr];
            dis++;
        }
        System.out.println(String.valueOf(source));
        return dis;
    }
// =============================================================================================
//    DFS                                                                                     ||
// =============================================================================================
//    Using Recursion (DRY)
    private boolean dfsUtil(int source, int destination, boolean[] vis){
        // Helper for dfs
        if (source == destination) return true;

        for(int neighbor: adj[source]){
            if(!vis[neighbor]) {
                vis[neighbor] = true;
                boolean isConnected = dfsUtil(neighbor, destination, vis);
                if (isConnected) return true;
            }
        }
        return false;
    }

    public boolean dfs(int source, int destination){
        boolean[] vis = new boolean[adj.length];
        vis[source] = true;

        return dfsUtil(source, destination, vis);
    }

//    Using Stack
    public boolean dfsStack(int source, int destination){
        boolean[] vis = new boolean[adj.length];
        vis[source] =  true;

        // instantiating stack
        Stack<Integer> stack = new Stack<>();
        stack.push(source);


        while(!stack.isEmpty()){
            int curr = stack.pop();
            if (curr == destination) return true;
            for (int neighbor: adj[curr]) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }

// =============================================================================================
//    Driver Code                                                                             ||
// =============================================================================================
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Vertices & Edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        // instantiating Graph object
        Graph graph = new Graph(v);

        // inputs for the edges
        System.out.println("Enter Edges: ");
        for(int i = 0; i < e; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();

            // add edges to the graph
            graph.addEdge(source, destination);
        }

        // Implementing BFS
        System.out.println("Enter Source & Destination: ");
        int source = sc.nextInt();
        int destination = sc.nextInt();

        // BFS
        int distance = graph.bfs(source, destination);
        if(distance != 0){
            System.out.println("Distance from source to destination is: "+String.valueOf(distance));
        }else{
            System.out.println("Distance from source to destination is: Unknown!");
        }

        // DFS
        boolean p = graph.dfs(source, destination); // dfa using recursion

        boolean ps = graph.dfsStack(source, destination); // Dfs using stack
        if(p){
            System.out.println("Destination Found! At least one path possible.");
        }else{
            System.out.println("Destination Path Not Possible!");
        }

    }
}
