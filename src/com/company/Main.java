package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Integer[]arr = new Integer[100];
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if(arr[i] % 2 == 0 && arr[i] % 5 == 0) {
                linkedList.addFirst(arr[i]);
            } else if (arr[i] % 2 == 0 && arr[i] % 5 != 0) {
                linkedList.addLast(arr[i]);
            }
        }
        HashSet<Integer> hashSet = new LinkedHashSet<>(linkedList);
        System.out.println(hashSet);
    }
}
