package java.datastructure.linear.list;

import java.util.Collection;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: java.datastructure.linear.list
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 05-06-2021
 */

public class MyAbstractList<E> implements MyList<E> {
    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public boolean add(int index, E item) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
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
}
