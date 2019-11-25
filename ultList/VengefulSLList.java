package com.ultList;

public class VengefulSLList<Type> extends SLList<Type>{
    /**Field:
     * private SLList recorder.
     *
     * Constructors:
     * public VengefulSLList();
     * public VengefulSLList(Type t).
     *
     * Method:
     * public Type removeLast(); @Override
     * public void printMvLst().
     */

    private SLList recorder;

    /** Constructors. */
    public VengefulSLList(){
        super();
        recorder = new SLList();
    }

    public VengefulSLList(Type t){
        super(t);
        recorder = new SLList();
    }

    /** Remove the last item and return it value. Meanwhile, record the value into the recorder. */
    @Override
    public Type removeLast(){
        Type temp = super.removeLast();
        recorder.addLast(temp);
        return temp;
    }

    public void printMvLst(){
        recorder.printAll();
    }
}
