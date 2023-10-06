package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts {
    /**
     * Removes and returns the top element from the stack.
     *
     * @return The top element of the stack
     */
    int pop();
    /**
     * Pushes a new element onto the stack.
     *
     * @param x The element to be pushed onto the stack
     */
    void push(int x);
    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }
    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack
     */
    int numOfElems();
    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack
     */
    int peek();
}
