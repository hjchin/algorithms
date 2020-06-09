package graph;

public class EdgeWeightedDigraph {

    int V;
    Graph.Bag<DirectedEdge>[] bag;

    EdgeWeightedDigraph(int v){
        V = v;
        bag = new Graph.Bag[v];
        for(int i=0;i<v;i++)bag[i] = new Graph.Bag<DirectedEdge>();
    }

    void addEdge(DirectedEdge e){
        bag[e.from()].add(e);
    }

    Iterable<DirectedEdge> adj(int v){
        return bag[v];
    }

    int V(){
        return V;
    }
}
