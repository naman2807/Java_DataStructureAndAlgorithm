package java.datastructure.linear.list.arraylist;

import java.datastructure.linear.list.MyAbstractList;
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

    private Object[] list;
    private int DEFAULT_CAPACITY = 10;

    public MyArrayList(){
        this.list = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E item) {
        if(list.length == DEFAULT_CAPACITY){
            reallocate(10);
        }
        this.list[size()] = item;
        return true;
    }

    @Override
    public boolean add(int index, E item) {
        return super.add(index, item);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return super.addAll(index, c);
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
        return null;
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
        return 0;
    }

    private void reallocate(int size){
        this.DEFAULT_CAPACITY += size;
        this.list = Arrays.copyOf(this.list, DEFAULT_CAPACITY);
    }
}
