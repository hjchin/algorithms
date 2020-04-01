package symbolTable;

import java.util.Iterator;

public class Bag implements Iterable<Integer> {

    private int[] array;
    private int size = 0;

    public Bag(int size){
        array = new int[size];
    }

    public void add(int item){
        array[size++] = item;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Integer>{

        private int counter = 0;

        @Override
        public boolean hasNext() {
            if(counter < size) return true;
            return false;
        }

        @Override
        public Integer next() {
            return array[counter++];
        }
    }
}
