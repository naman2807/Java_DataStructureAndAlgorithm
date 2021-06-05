package java.datastructure.linear.list;

import java.util.Collection;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: java.datastructure.linear.list
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 04-06-2021
 */

public interface MyList<E> {

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

    /**
     * Removes all of the elements from this list
     */
    void clear();

    /**
     * Checks whether the item is present in the list.
     * @param item - element which is to be checked.
     * @return - Returns true if this list contains the specified element.
     */
    boolean contains(Object item);

    /**
     * Checks whether the list of items is present in the list.
     * @param c - list of elements which is to be checked.
     * @return Returns true if this list contains all of the elements of the specified collection.
     */
    boolean containsAll(Collection<? extends E> c);

    /**
     * Compares the specified object with this list for equality.
     * @param item - element which is to be equated.
     * @return boolean value.
     */
    boolean equals(Object item);

    /**
     * @param index - position of element which is to be returned.
     * @return element of type E.
     */
    E get(int index);

    /**
     * Evaluates the hashcode of the list.
     * @return hash code value for this list.
     */
    int hashCode();

    /**
     * @param item - element whose index is to be returned.
     * @return  index of the first occurrence of the specified element in this list,
     *          or -1 if this list does not contain the element.
     */
    int indexOf(Object item);

    /**
     * @return true if this list contains no elements.
     */
    boolean isEmpty();

    /**
     * Removes the element at the specified position in this list
     * @param index - position of element which is to be removed.
     * @return - element at specified index.
     */
    E remove(int index);

    /**
     * Removes the first occurrence of the specified element from this list, if it is present
     * @param item - element which is to be removed.
     * @return boolean value
     */
    boolean remove(Object item);

    /**
     * Removes from this list all of its elements that are contained in the specified collection
     * @param c - list of items which is to be removed.
     * @return boolean value
     */
    boolean removeAll(Collection<? extends E> c);

    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index - position of element which is to be replaced.
     * @param item - new element which is to be added.
     * @return old element which is replaced.
     */
    E set(int index, E item);

    /**
     * @return number of elements in this list.
     */
    int size();
}
