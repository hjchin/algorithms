package graph;

public class UnionFind {

    int[] id;

    UnionFind(int size){
        id = new int[size];
        for(int i=0;i<id.length;i++) id[i] = i;
    }

    boolean isConnected(int v, int w){
        return id[v] == id[w];
    }

    void union(int v, int w){
        int id1 =id[v];
        int id2 =id[w];
        for(int i=0;i<id.length;i++){
            if(id[i] == id2){
                id[i] = id1;
            }
        }
    }
}
