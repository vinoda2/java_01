package com.xworkz.nothing.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionProgramming {


    //How can you convert a `List` to a `Set`?
    public static List<String> listOfProducts = new ArrayList<String>();
    public static void convertListToSet(){
        listOfProducts.add("Cream");
        System.out.println(" convert a `List` to a `Set`");
        Set<String>  setOfProducts = new HashSet<>(listOfProducts);
        System.out.println(setOfProducts);
    }

    public static void immutabilityInCollection(){
        System.out.println("`immutability` in collection");
        List<String> listOfNames = List.of("vinoda","vinu","pinku");
        System.out.println(listOfNames);
        //once list is created we can't add the new elements bcz if we use List.of() from java 9, it is  a immutable
        //listOfNames.add("pinku");
        //System.out.println(listOfNames);
    }
    //using the filter the method from java 8
    public static void getNameStartWithS(){
        List<String> listOfProducts = new ArrayList<String>();
        listOfProducts.add("mobile");
        listOfProducts.add("Laptop");
        listOfProducts.add("Micro Phone");
        listOfProducts.add("Sim");
        listOfProducts.add("song");
        listOfProducts.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
        listOfProducts.stream().filter(s->s.contains("o")).forEach(System.out::println);


    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
        return result;
    }


}
