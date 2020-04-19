package implementation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NonDivisibleSubsetTest {

    @Test
    public void test(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);
        assertEquals(3, NonDivisibleSubset.run(3, list));
    }

    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(3);
        assertEquals(3, NonDivisibleSubset.run(3, list));
    }
}