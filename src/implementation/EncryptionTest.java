package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionTest {

    @Test
    public void test(){
        assertEquals("hae and via ecy",Encryption.run("haveaniceday"));
        assertEquals("fto ehg ee dd",Encryption.run("feedthedog"));
        assertEquals("clu hlt io",Encryption.run("chillout"));
    }

}