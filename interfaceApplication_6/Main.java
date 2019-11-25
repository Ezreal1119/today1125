package com.interfaceApplication_6;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Dog dog_1 = new Dog("2aka", 20);
        Dog dog_2 = new Dog("好bbc",5321);
        Comparator<Dog> nc_1 = Dog.getNameComparator();
        Comparator<Dog> nc_2 = Dog.getSizeComparator();
        System.out.println(nc_1.compare(dog_1, dog_2));
        System.out.println(nc_2.compare(dog_1, dog_2));
    }
}
