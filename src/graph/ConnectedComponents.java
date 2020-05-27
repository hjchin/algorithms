package graph;

public class ConnectedComponents {

    boolean[] marked;
    int[] id;
    int count;

    ConnectedComponents(Graph g){
        marked = new boolean[g.V()];
        id = new int[g.V()];

        for(int i=0;i<g.V();i++){
            if(!marked[i]){
                dps(g, i);
                count++;
            }
        }
    }

    public boolean isConnected(int v, int w){
        return id[v] == id[w];
    }

    public int id(int v){
        return id[v];
    }

    private void dps(Graph g, int s){
        marked[s] = true;
        id[s] = count;
        for(int i:g.getAdj(s)){
            if(!marked[i]){
                dps(g, i);
            }
        }
    }
}
