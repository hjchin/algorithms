package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinPQTest {

    @Test
    public void test(){
        MinPQ q = new MinPQ(5);
        q.insert(4);
        q.insert(10);
        q.insert(11);
        q.insert(6);
        q.insert(3);

        assertEquals(3,q.deleteMin());
    }

}