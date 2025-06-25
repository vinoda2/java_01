package com.xworkz.nothing.collection;

import java.util.List;

public class CollectionRunner {
    public static void main(String[] args) {
        CollectionProgramming.convertListToSet();
        CollectionProgramming.immutabilityInCollection();
        CollectionProgramming.getNameStartWithS();
        int[] arr1 = {1, 5, 10, 20, 40, 80,21};
        int[] arr2 = {6, 7, 20, 80, 100,21};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120,21};

        List<Integer> commonElements = CollectionProgramming.findCommonElements(arr1, arr2, arr3);
        System.out.println("Common elements: " + commonElements);
    }
}
