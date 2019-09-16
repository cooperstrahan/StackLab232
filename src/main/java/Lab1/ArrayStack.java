/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author cooperstrahan
 * @param <E>
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements Iterable<Object> {
    private Object[] arr;
    private int N;
    
    public ArrayStack(int capacity)  {
        arr = new Object[capacity];
        N = 0;
    }
    
    public boolean isEmpty(){
        return N == 0;
    }
    
    public boolean isFull(){
        return N == arr.length;
    }
    
    public void push(E newElement){
        arr[N++] = newElement;
    }
    
    public Object pop(){
        return arr[--N];
    }
    
    public Object peek() {
        return arr[N-1];
    }
    
    public Iterator<Object> iterator() {
        return new ReverseArrayIterator();
    }
    
    public class ReverseArrayIterator implements Iterator<Object> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }

        public Object next() { 
            if (!hasNext()) throw new NoSuchElementException();
            return arr[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
}
