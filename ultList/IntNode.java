package com.ultList;

public class IntNode<Type> {
    /**Fields:
     * Type item;
     * IntNode next;
     *
     * Constructors:
     * public IntNode();
     * public IntNode(Type t);
     */

    public Type item;
    public IntNode next;

    /** Constructors */
    public IntNode(){
        item = null;
        next = null;
    }

    public IntNode(Type t){
        item = t;
        next = null;
    }
}
