package com.interfaceApplication_6;
import java.util.Comparator;

public class Dog {
    String name;
    int size;

    public Dog(String n, int s){
        name = n;
        size = s;
    }

    public void bark(){
        System.out.println(name + ": wangwang!!");
    }

    private static class NameComparator implements Comparator<Dog>{

        @Override
        public int compare(Dog a, Dog b){
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }

    private static class SizeComparator implements Comparator<Dog>{

        @Override
        public int compare(Dog a, Dog b){
            return a.size - b.size;
        }
    }

    public static Comparator<Dog> getSizeComparator(){
        return new SizeComparator();
    }
}
