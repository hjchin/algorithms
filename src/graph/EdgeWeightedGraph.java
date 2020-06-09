package graph;

import java.util.ArrayList;

public class EdgeWeightedGraph {

    int V;
    Graph.Bag<Edge> adj[];
    ArrayList<Edge> edges = new ArrayList<Edge>();

    EdgeWeightedGraph(int V){
        this.V = V;
        adj = new Graph.Bag[V];
        for(int i=0;i<V;i++){
            adj[i] = new Graph.Bag<Edge>();
        }
    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        edges.add(e);
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }

    public Iterable<Edge> edges(){
        return edges;
    }

    public int V(){
        return V;
    }
}
