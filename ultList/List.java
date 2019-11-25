package com.ultList;

public interface List<Type> {

    int getSize();

    void addFirst(Type t);

    void addLast(Type t);

    Type getFirst();

    Type getLast();

    Type get(int x);

    Type removeLast();

    void print(int x);

    void printAll();


    /** Boss wants the special print to be something below, but that is a very stupid idea.
     * SLList takes it, but not AList. Because AList is a smart boy.
     */
    default public void specialPrint(){
        System.out.println(getFirst() + " ,,,,, " + getLast());
    }

}
