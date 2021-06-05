package datastructure.list;

import datastructure.list.MyList;

import java.util.Collection;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: java.datastructure.linear.list
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 05-06-2021
 */

public abstract class MyAbstractList<E> implements MyList<E> {

    /**
     * This method calls another overloaded method to add element.
     * @param item - element to be added in list.
     * @return boolean value
     */
    @Override
    public boolean add(E item) {
        add(size(), item);
        return false;
    }

    /**
     * Adds element to the list.
     * @param index - index at which the element has to be added.
     * @param item - element which is to be added.
     * @return boolean value
     */
    @Override
    public boolean add(int index, E item) {
        throw new UnsupportedOperationException();
    }

    /**
     * This method calls another overloaded method to add collection of elements.
     * @param c - list of items which is to be added
     * @return boolean value.
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addAll(size(), c);
        return false;
    }

    /**
     * Adds collection of items to list.
     * @param index - position at which the list has to be added.
     * @param c - list of items which is to be added.
     * @return  UnsupportedOperationException
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return 0;
    }
}
