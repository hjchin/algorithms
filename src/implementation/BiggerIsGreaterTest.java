package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerIsGreaterTest {

    @Test
    public void test(){
        assertEquals("ba",BiggerIsGreater.run("ab"));
        assertEquals("no answer",BiggerIsGreater.run("bb"));
        assertEquals("hegf",BiggerIsGreater.run("hefg"));
        assertEquals("dhkc",BiggerIsGreater.run("dhck"));
        assertEquals("hcdk",BiggerIsGreater.run("dkhc"));

        assertEquals("lmon",BiggerIsGreater.run("lmno"));
        assertEquals("no answer",BiggerIsGreater.run("dcba"));
        assertEquals("no answer",BiggerIsGreater.run("dcbb"));
        assertEquals("acbd",BiggerIsGreater.run("abdc"));
        assertEquals("abdc",BiggerIsGreater.run("abcd"));
        assertEquals("fedcbabdc",BiggerIsGreater.run("fedcbabcd"));
    }

}