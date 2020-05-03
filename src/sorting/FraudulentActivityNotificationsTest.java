package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudulentActivityNotificationsTest {


    @Test
    public void test(){
        int[] exp = {10,20,30,40,50};
        assertEquals(1,FraudulentActivityNotifications.run(exp,3));
    }
}