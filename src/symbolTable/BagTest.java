package symbolTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest {

    @Test
    public void bag(){

        Bag bag = new Bag(10);
        bag.add(1);
        bag.add(2);

        int expected = 1;
        for(Integer i: bag){
            assertEquals(expected, i.intValue());
            expected++;
        }

    }
}