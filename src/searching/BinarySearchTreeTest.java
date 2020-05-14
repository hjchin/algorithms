package searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testBinarySearchTree(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.put("a", "aaa");
        bst.put("d", "ccc");
        bst.put("b", "bbb");
        bst.put("c", "ccc");

        assertEquals("ccc",bst.get("c"));
        assertEquals("aaa",bst.get("a"));
        assertEquals(null,bst.get("ab"));

        bst.put("b","88888");
        assertEquals("88888",bst.get("b"));
    }
}