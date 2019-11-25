package com.ultList;

public class RotatingSLList<Type> extends SLList<Type>{
    /**Field: null.
     *
     * Constructors:
     * public RotatingSLList();
     * public RotatingSLList(Type t).
     *
     * Method:
     * public void rotateSLList().
     */

    public RotatingSLList(){
        super();
    }

    public RotatingSLList(Type t){
        super(t);
    }

    /** Rotate the whole SLList to the right. */
    public void rotateSLList(){
        addFirst(removeLast());
    }
}
