package strings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;
import static strings.CommonChild.isCommonChild;

public class CommonChildTest {

    @Test
    public void testIsCommonChild(){
        String s1 = "ABCD";
        String s2 = "ABDC";

        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(0);
        assertTrue(isCommonChild(indices, s1, s2));

        indices.add(1);
        assertTrue(isCommonChild(indices, s1, s2));

        indices.add(2);
        assertTrue(isCommonChild(indices, s1, s2));

        indices = new ArrayList<>();
        indices.add(0);indices.add(1);indices.add(3);
        assertTrue(isCommonChild(indices, s1, s2));

        indices = new ArrayList<>();
        indices.add(0);indices.add(2);indices.add(3);
        assertFalse(isCommonChild(indices, s1, s2));

        indices = new ArrayList<>();
        indices.add(2);indices.add(3);
        assertFalse(isCommonChild(indices, s1, s2));
    }

    @Test
    public void testIsCommonChild2(){
        String s1 = "abaacc";
        String s2 = "abbbaccc";

        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(1);indices.add(2);
        assertTrue(isCommonChild(indices, s1, s2));

        indices = new ArrayList<>();
        indices.add(1);indices.add(2);indices.add(3);
        assertFalse(isCommonChild(indices, s1, s2));
    }

    @Test
    public void testIsCommonChild3(){
        String s1 = "abaaddcc";
        String s2 = "abbbaccc";
        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(0);indices.add(2);indices.add(3);
        assertFalse(isCommonChild(indices, s1, s2));

        indices = new ArrayList<>();
        indices.add(0);indices.add(2);indices.add(4);
        assertFalse(isCommonChild(indices, s1, s2));
    }

    @Test
    public void testRecursive(){
        String s1 = "abaaddcc";
        String s2 = "abbbaccc";
        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(6);
        int maxLen = CommonChild.findMaxChildLength(indices, s1, s2, 0);
        assertEquals("cc",CommonChild.cc);
        assertEquals(2,maxLen);

        CommonChild.cc = "";
        indices = new ArrayList<>();
        indices.add(5);
        maxLen = CommonChild.findMaxChildLength(indices, s1, s2, 0);
        assertEquals("",CommonChild.cc);
        assertEquals(0,maxLen);

        CommonChild.cc = "";
        indices = new ArrayList<>();
        indices.add(3);
        maxLen = CommonChild.findMaxChildLength(indices, s1, s2, 0);
        assertEquals("acc",CommonChild.cc);
        assertEquals(3,maxLen);
    }

    @Test
    public void test(){
        assertEquals(3,CommonChild.run("ABCD", "ABDC"));
        assertEquals(2,CommonChild.run("HARRY", "SALLY"));
        assertEquals(0,CommonChild.run("AA", "BB"));
        assertEquals(3,CommonChild.run("SHINCHAN", "NOHARAAA"));
        assertEquals(2,CommonChild.run("ABCDEF", "FBDAMN"));


    }
}