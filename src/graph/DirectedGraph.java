package graph;

public class DirectedGraph {

    Graph.Bag[] bag;
    int size;

    DirectedGraph(int V){
        size = V;
        bag = new Graph.Bag[V];
        for(int i=0;i<V;i++){
            bag[i] = new Graph.Bag();
        }
    }

    public void addEdge(int v, int w){
        bag[v].add(w);
    }

    public Iterable<Integer> adj(int v){
        return bag[v];
    }

    public int degree(int v){
        return bag[v].size();
    }

    public int V(){
        return size;
    }
}
