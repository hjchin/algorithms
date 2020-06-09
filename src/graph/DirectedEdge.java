package graph;

public class DirectedEdge {

    int v,w;
    double weight;

    DirectedEdge(int v, int w, double weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    int from(){
        return v;
    }

    int to(){
        return w;
    }

    double weight(){
        return weight;
    }

}
