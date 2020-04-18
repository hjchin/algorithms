package implementation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PickingNumbersTest {

    @Test
    public void testPickingNumbers(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(3);
        input.add(1);
        input.add(2);
        assertEquals(5, PickingNumbers.run(input));
    }

    @Test
    public void testPickingNumbers2(){
        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(4);
        input2.add(6);
        input2.add(5);
        input2.add(3);
        input2.add(3);
        input2.add(1);
        assertEquals(3, PickingNumbers.run(input2));
    }

    @Test
    public void testSublist(){
        PickingNumbers.SubList subList = new PickingNumbers.SubList();
        subList.addElement(4);
        assertTrue(subList.isInRange(5));
        subList.addElement(5);
        assertFalse(subList.isInRange(3));
    }

}