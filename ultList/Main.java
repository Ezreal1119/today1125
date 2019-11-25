package com.ultList;

public class Main {

    /** Static method that used to test interface. */
    public static int findMax(List<Integer> ls){
        int maxIndex = 0;
        for (int i = 1; i < ls.getSize(); i++){
            if (ls.get(maxIndex) < ls.get(i)){
                maxIndex = i;
            }
        }
        return ls.get(maxIndex);
    }

    /** Main method. */
    public static void main(String[] args){
        List<Integer> test = new SLList(700);
        test.addLast(9);
        test.addLast(19);
        test.addFirst(1);
        test.addFirst(-7);
        test.printAll();
        //test.rotateSLList();
        test.printAll();
        findMax(test);
        //test.removeLast();
        //test.removeLast();
        //test.removeLast();
        //test.printMvLst();

    }
}
