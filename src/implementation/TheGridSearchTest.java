package implementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheGridSearchTest {

    @Test
    public void test(){
        String[] g = {
            "1234567890",
            "0987654321",
            "1111111111",
            "1111111111",
            "2222222222"
        };

        String[] p = {
            "876543",
            "111111",
            "111111"
        };

        assertEquals("YES",TheGridSearch.run(g, p));
    }

    @Test
    public void test2(){
        String[] g = {
            "7283455864",
            "6731158619",
            "8988242643",
            "3830589324",
            "2229505813",
            "5633845374",
            "6473530293",
            "7053106601",
            "0834282956",
            "4607924137"
        };

        String[] p = {
            "9505",
            "3845",
            "3530",
        };

        assertEquals("YES",TheGridSearch.run(g, p));
    }

    @Test
    public void test3(){
        String[] g = {
                "400453592126560",
                "114213133098692",
                "474386082879648",
                "522356951189169",
                "887109450487496",
                "252802633388782",
                "502771484966748",
                "075975207693780",
                "511799789562806",
                "404007454272504",
                "549043809916080",
                "962410809534811",
                "445893523733475",
                "768705303214174",
                "650629270887160"
        };

        String[] p = {
                "99",
                "99",
        };

        assertEquals("NO",TheGridSearch.run(g, p));
    }

    @Test
    public void test4(){
        String[] g = {
            "123412",
            "561212",
            "123634",
            "781288"
        };

        String[] p = {
            "12",
            "34",
        };

        assertEquals("YES",TheGridSearch.run(g, p));
    }
}