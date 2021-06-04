package java.util.list;

import java.util.Collection;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: java.util.list
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 04-06-2021
 */

public interface List<E> {

    /**
     * Appends the specified element to the end of the list
     * @param item - element to be added in list.
     * @return boolean value
     */
    boolean add(E item);

    /**
     * Inserts the specified element at the specified position in the list
     * @param index - index at which the element has to be added.
     * @param item - element which is to be added.
     * @return boolean value
     */
    boolean add(int index, E item);

    /**
     * Appends all of the elements in the specified collection to the end of this list,
     * in the order that they are returned by the specified collection's iterator
     * @param c - list of items which is to be added
     * @return - boolean value.
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * Inserts all of the elements in the specified collection into this list at the specified position
     * @param index - position at which the list has to be added.
     * @param c - list of items which is to be added.
     * @return boolean value
     */
    boolean addAll(int index, Collection<? extends E> c);
}
