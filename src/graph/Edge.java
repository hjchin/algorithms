package graph;

public class Edge implements Comparable<Edge>{

    int v,w;
    double weight;

    Edge(int v, int w, double weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either(){
        return v;
    }

    public int other(int vertex){
        return vertex == v? w : v;
    }

    @Override
    public int compareTo(Edge o) {
        if(weight < o.weight) return -1;
        if(weight > o.weight) return 1;
        return 0;
    }
}
