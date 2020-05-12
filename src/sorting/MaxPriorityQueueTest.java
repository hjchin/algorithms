package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPriorityQueueTest {


    @Test
    public void testMaxPriorityQueue() {
        MaxPriorityQueue q = new MaxPriorityQueue(5);
        q.insert(4);
        q.insert(10);
        q.insert(11);
        q.insert(6);
        q.insert(8);

        assertEquals(11,q.deleteMax());
    }
}