package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnionFindTest {

    @Test
    public void test(){
        UnionFind uf = new UnionFind(10);
        assertFalse(uf.isConnected(9,2));
        uf.union(9,2);
        assertTrue(uf.isConnected(2,9));
        assertFalse(uf.isConnected(2,5));
        uf.union(9,5);
    }

}