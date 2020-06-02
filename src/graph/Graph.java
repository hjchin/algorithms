package graph;

import symbolTable.Bag;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph {

    Bag<Integer>[] adj;
    int V;

    Graph(int V){
        adj = new Bag[V];
        for(int i=0;i<V;i++){
            adj[i] = new Bag<Integer>();
        }
        this.V = V;
    }

    public void addEdge(int x, int w){
        adj[x].add(w);
        adj[w].add(x);
    }

    public Iterable<Integer> getAdj(int x){
        return adj[x];
    }

    public int V(){
        return V;
    }

    static class Bag<T> implements Iterable<T>{

        ArrayList<T> bag = new ArrayList<T>();

        public void add(T i){
            bag.add(i);
        }

        public int size(){
            return bag.size();
        }

        @Override
        public Iterator<T> iterator() {
            return bag.iterator();
        }
    }
}
