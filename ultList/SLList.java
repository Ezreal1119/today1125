package com.ultList;

public class SLList<Type> implements List<Type> {
    /**It is rather inconvenient to do every operation with ith element especial the last element.
     */

    /**Fields:
     * private int size;
     * private IntNode.
     *
     * Constructors:
     * public SLList();
     * public SLList(Type).
     *
     * Methods:
     * public int getSize(); @Override
     * public void addFirst(Type t); @Override
     * public void addLast(Type t); @Override
     * public Type getFirst(); @Override
     * public Type getLast(); @Override
     * public Type get(int x); @Override
     * public void print(int x); @Override
     * public void printAll(); @Override
     * public int getSizeByRecursion();
     * private static int getSizeHelper(IntNode firstNode).
     */

    private int size;
    private IntNode sentinel;

    /** Constructors. */
    public SLList(){
        sentinel = new IntNode();
        size = 0;
    }

    public SLList(Type t){
        sentinel = new IntNode();
        sentinel.next = new IntNode(t);
        size = 1;
    }

    /** Return the size of the SLList. */
    @Override
    public int getSize(){
        return size;
    }

    /** Add something to the front of the SLList. */
    @Override
    public void addFirst(Type t){
        IntNode firstNode = new IntNode(t);
        firstNode.next = sentinel.next;
        sentinel.next = firstNode;
        size += 1;
    }

    /** Add something to the end of the SLList. */
    @Override
    public void addLast(Type t){
        IntNode lastNode = new IntNode(t);
        IntNode temp = sentinel;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = lastNode;
        size += 1;
    }

    /** Return the value of the first element. */
    @Override
    public Type getFirst(){
        return (Type) sentinel.next.item;
    }

    /** Return the value of the last element. */
    @Override
    public Type getLast(){
        IntNode temp = sentinel;
        while (temp.next != null){
            temp = temp.next;
        }
        return (Type) temp.item;
    }

    /** Return the value of the ith element. */
    @Override
    public Type get(int x){
        IntNode temp = sentinel.next;
        for (int i = 0; i < x; i++){
            temp = temp.next;
        }
        return (Type) temp.item;
    }

    /** Remove the last element and return its value. */
    @Override
    public Type removeLast(){
        Type temp = getLast();
        IntNode temp1 = sentinel;
        for (int i = 0; i < getSize() - 1; i++){
            temp1 = temp1.next;
        }
        temp1.next = null;
        size -= 1;
        return temp;
    }

    /** Print the ith element of the SLList. */
    @Override
    public void print(int x){
        IntNode temp = sentinel.next;
        for (int i = 0; i < x; i++){
            temp = temp.next;
        }
        System.out.println(temp.item);
    }

    /** Print out the whole SLList. */
    @Override
    public void printAll(){
        IntNode temp = sentinel.next;
        for (int i = 0; i < size; i++){
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /** Another way of getting the size of SLList. (Recursion!) */
    public int getSizeByRecursion(){
        return getSizeHelper(sentinel);
    }

    /** Helper method of method getSizeByRecursion(). */
    private static int getSizeHelper(IntNode firstNode){
        if (firstNode.next == null){
            return 0;
        }
        return 1 + getSizeHelper(firstNode.next);
    }
}
