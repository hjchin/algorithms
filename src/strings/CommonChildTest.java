package strings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CommonChildTest {


    @Test
    public void test(){
        assertEquals(3,CommonChild.run("ABCD", "ABDC"));
        assertEquals(2,CommonChild.run("HARRY", "SALLY"));
        assertEquals(0,CommonChild.run("AA", "BB"));
        assertEquals(3,CommonChild.run("SHINCHAN", "NOHARAAA"));
        assertEquals(2,CommonChild.run("ABCDEF", "FBDAMN"));


    }
}