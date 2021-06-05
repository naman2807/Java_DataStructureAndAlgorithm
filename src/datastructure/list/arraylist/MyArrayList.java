package datastructure.list.arraylist;

import datastructure.list.MyAbstractList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: java.datastructure.linear.list.arraylist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 05-06-2021
 */

public class MyArrayList<E> extends MyAbstractList<E> {

    private E[] list;
    private int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public MyArrayList(){
        this.list = (E[]) new Object[DEFAULT_CAPACITY];
    }

    /**
     * Adds value to ArrayList by calling other overloaded method.
     * @param item - element to be added in list.
     * @return boolean value
     */
    @Override
    public boolean add(E item) {
        return add(size(), item);
    }

    /**
     * Adds element to specified index.
     * @param index - index at which the element has to be added.
     * @param item - element which is to be added.
     * @return boolean value.
     */
    @Override
    public boolean add(int index, E item) {
        if(index < 0 || index > DEFAULT_CAPACITY){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }else if(this.size == DEFAULT_CAPACITY){
            reallocate(10);
        }else if(index == this.size){
            this.list[index] = item;
            size++;
            return true;
        }
        for(int i = size() ; i > index; i--){
            this.list[i] = this.list[i-1];
        }
        this.list[index] = item;
        return true;
    }

    /**
     * Adds collection of values to ArrayList.
     * @param c - list of items which is to be added
     * @return boolean value.
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return addAll(size(), c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if(index < 0 || index > DEFAULT_CAPACITY ){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        reallocate(c.size());
        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public E get(int index) {
        return this.list[index];
    }

    @Override
    public int indexOf(Object item) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public E set(int index, E item) {
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void reallocate(int capacity){
        this.DEFAULT_CAPACITY += capacity;
        this.list = Arrays.copyOf(this.list, DEFAULT_CAPACITY);
    }
}
