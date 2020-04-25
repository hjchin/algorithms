package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SherlockAndTheValidStringTest {

    @Test
    public void test(){
        String s = "aabbcd";
        assertEquals("NO",SherlockAndTheValidString.run(s));

        s = "aabbccddeefghi";
        assertEquals("NO",SherlockAndTheValidString.run(s));

        s = "abcdefghhgfedecba";
        assertEquals("YES",SherlockAndTheValidString.run(s));

        s = "aabbc";
        assertEquals("YES",SherlockAndTheValidString.run(s));

        s = "bbccddeeff";
        assertEquals("YES",SherlockAndTheValidString.run(s));

        s = "aaaabbcc";
        assertEquals("NO",SherlockAndTheValidString.run(s));

        s = "qwertyuio";
        assertEquals("YES",SherlockAndTheValidString.run(s));

        s = "aaaaaaaa";
        assertEquals("YES",SherlockAndTheValidString.run(s));



    }



}