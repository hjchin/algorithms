package graph;

public class EdgeWeightedGraph {

    int V;
    Graph.Bag<Edge> adj[];

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
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }
}
