package datastructure.list.arraylist;

import datastructure.list.MyAbstractList;
import datastructure.list.MyList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

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
//        for(int i = size() ; i > index; i--){
//            this.list[i] = this.list[i-1];
//        }
        if (size() - index >= 0)
            System.arraycopy(this.list, index, this.list, index + 1, size() - index);
        this.list[index] = item;
        size++;
        return true;
    }

    /**
     * Adds collection of values to ArrayList.
     * @param c - list of items which is to be added
     * @return boolean value.
     */
    @Override
    public boolean addAll(MyList<? extends E> c) {
        return addAll(size(), c);
    }

    @Override
    public boolean addAll(int index, MyList<? extends E> c) {
        if(index < 0 || index > DEFAULT_CAPACITY ){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }else if(index == size()){
            reallocate(c.size());
            c.forEach(e -> {
                this.list[size] = e;
                size++;
            });
            return true;
        }
        reallocate(c.size());
        c.forEach(e -> {
            add(index, e);
        });
        return true;
    }

    @Override
    public void clear() {
        Arrays.stream(this.list).forEach(this::remove);
    }

    @Override
    public boolean contains(Object item) {
        for (E e : this.list) {
            if(e.equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(MyList<? extends E> c) {
        boolean contain = true;
        for (E value : c) {
            contain = contains(value);
            if(!contain){
                return contain;
            }
        }
        return contain;
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
        return size() == 0;
    }

    @Override
    public E remove(int index) {
        E value = this.list[index];
        if (size - (index + 1) >= 0)
            System.arraycopy(this.list, index + 1, this.list, index + 1 - 1, size - (index + 1));
        return value;
    }

    @Override
    public boolean remove(Object item) {
        for (int i = 0; i < size; i++) {
            if(this.list[i].equals(null)){

            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public E set(int index, E item) {
        E value = this.list[index];
        this.list[index] = item;
        return value;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void reallocate(int capacity){
        this.DEFAULT_CAPACITY += capacity;
        this.list = Arrays.copyOf(this.list, DEFAULT_CAPACITY);
    }

    @Override
    public Iterator<E> iterator() {
        return Arrays.stream(this.list).iterator();
    }
}
