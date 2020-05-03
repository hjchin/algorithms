package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudulentActivityNotificationsTest {


    @Test
    public void test(){
        int[] exp = {10,20,30,40,50};
        assertEquals(1,FraudulentActivityNotifications.run(exp,3));
    }

    @Test
    public void test2(){
        int[] exp = {2,3,4,2,3,6,8,4,5};
        assertEquals(2,FraudulentActivityNotifications.run(exp,5));
    }


    @Test
    public void test3(){
        int[] exp = {1,2,3,4,4};
        assertEquals(0,FraudulentActivityNotifications.run(exp,4));
    }


    /*

    sort index -> exp
    map exp - > {index1, index2}

    for(e: exp){

    }


     */
}