import edu.princeton.cs.algs4.*;

import java.util.ArrayList;
import java.util.HashMap;

public class TrainPlanner {
    private static HashMap<String, Integer> hashMap = new HashMap<>(); // Name, Index
    public static HashMap<Integer, Integer> passengers; // Index, Nearest
    private static Graph graph;

    public static void main(String[] args) {
        hashMap.put("A", 0);
        hashMap.put("B", 1);
        hashMap.put("C", 2);
        hashMap.put("D", 3);
        hashMap.put("E", 4);
        passengers = new ArrayList<>(hashMap.size());
        passengers.put(10, -1);
        passengers.put(30, -1);
        passengers.put(50, -1);
        passengers.put(40, -1);
        passengers.put(20. -1);
        graph = new Graph(hashMap.size());
        graph.addEdge(hashMap.get("A"), hashMap.get("B"));
        graph.addEdge(hashMap.get("B"), hashMap.get("C"));
        graph.addEdge(hashMap.get("C"), hashMap.get("D"));
        graph.addEdge(hashMap.get("D"), hashMap.get("E"));

        Iterable<Integer> neighbours = graph.adj(hashMap.get("C"));
        BreadthFirstPaths bfs = new BreadthFirstPaths(graph, neighbours);
        for (Integer n : neighbours) {
            bfs.distTo()
        }
    }
}