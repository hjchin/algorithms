package stack;

import org.junit.Test;

import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testStack(){

        Stack<Integer> stack = new Stack<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        for(int i: stack){
            System.out.println(i);
        }

        System.out.println();

        Iterator<Integer> i = stack.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}