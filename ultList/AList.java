package com.ultList;

public class AList<Type> implements List<Type> {
    /** It is very easy to fetch the value of an element.
     * It is rather inconvenient to do addFirst method.
     * Add operation has to resize sometimes.
     */

    /**Fields:
     * Type[] array;
     * int size.
     *
     * Constructors:
     * public AList();
     * public AList(Type t).
     *
     * Methods:
     * public int getSize(); @Override
     * private void resize();
     * public void addFirst(Type t); @Override
     * public void addLast(Type t); @Override
     * public Type getFirst(); @Override
     * public Type getLast(); @Override
     * public Type get(int x); @Override
     * public Type removeLast(); @Override
     * public void print(int x); @Override
     * public void printAll(); @Override
     * public void specialPrint(). @Override
     */

    Type[] array;
    int size;

    /** Constructor. */
    public AList(){
        array = (Type[]) new Object[100];
        size = 0;
    }

    public AList(Type t){
        array = (Type[]) new Object[100];
        array[0] = t;
        size = 1;
    }

    /** Return the size of the AList. */
    @Override
    public int getSize(){
        return size;
    }

    /** Revise the capability of the ALList. */
    private void resize(){
        Type[] temp = (Type[]) new Object[array.length * 2];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    /** Add something to the front of the AList. */
    @Override
    public void addFirst(Type t){
        if (size == array.length){
            resize();
        }
        Type[] temp =(Type[]) new Object[array.length];
        System.arraycopy(array, 0, temp, 1, size);
        temp[0] = t;
        array = temp;
        size += 1;
    }

    /** Add something to the end of the AList. */
    @Override
    public void addLast(Type t){
        if (size == array.length){
            resize();
        }
        array[size] = t;
        size += 1;
    }

    /** Return the value of the first element. */
    @Override
    public Type getFirst(){
        return array[0];
    }

    /** Return the value of the last element. */
    @Override
    public Type getLast(){
        return array[size - 1];
    }

    /** Return the value of the xth element. */
    @Override
    public Type get(int x){
        return array[x];
    }

    /** Remove the last element and return its value. */
    @Override
    public Type removeLast(){
        Type temp = getLast();
        size -= 1;
        return temp;
    }

    /** Print the value of xth element. */
    @Override
    public void print(int x){
        System.out.println(array[x]);
    }

    /** Print out the whole AList. */
    @Override
    public void printAll(){
        for (int i = 0; i < size ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /** Special print against boss. */
    @Override
    public void specialPrint(){
        System.out.println("I love you!!");
    }
}
