package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrganizingContainerTest {

    @Test
    public void test(){
        int[][] container = {{1,1},{1,1}};
        assertEquals("Possible",OrganizingContainer.run(container));
    }

    @Test
    public void test2(){
        int[][] container = {{0,2},{1,1}};
        assertEquals("Impossible",OrganizingContainer.run(container));
    }

    @Test
    public void test3(){
        int[][] container = {{1,3,1},{2,1,2},{3,3,3}};
        assertEquals("Impossible",OrganizingContainer.run(container));
    }

    @Test
    public void test4(){
        int[][] container = {{0,2,1},{1,1,1},{2,0,0}};
        assertEquals("Possible",OrganizingContainer.run(container));
    }
}